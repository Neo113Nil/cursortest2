package e2;

import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import android.util.Log;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.device.worldclock.model.WorldClockConvert;
import com.crrepa.band.my.model.WorldClockModel;
import com.crrepa.band.my.model.db.WorldClock;
import com.crrepa.band.my.model.db.proxy.WorldClockDaoProxy;
import com.google.gson.Gson;
import com.moyoung.dafit.module.common.utils.d;
import com.moyoung.dafit.module.common.utils.t;
import com.moyoung.dafit.module.common.utils.x0;
import com.orhanobut.logger.f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
public class b {
    private static final String XML_TAG_CITY_NAME = "worldClockCityName";
    private static final String XML_TAG_IDENTIFIER = "timeZoneIdentifier";
    private static final String XML_TAG_ITEM = "item";
    private static final String XML_TAG_LATITUDE = "latitude";
    private static final String XML_TAG_LONGITUDE = "longitude";

    public static void checkSavedWorldClockTimeZone() {
        new Thread(new Runnable() { // from class: e2.a
            @Override // java.lang.Runnable
            public final void run() {
                b.lambda$checkSavedWorldClockTimeZone$0();
            }
        }).start();
    }

    private static List<WorldClockModel> getAllClock() {
        XmlResourceParser xml = d.get().getResources().getXml(R.xml.world_clock_time_zone_list);
        ArrayList arrayList = new ArrayList();
        int eventType = xml.getEventType();
        while (eventType != 1) {
            if (eventType == 2 && xml.getName().equals("item")) {
                WorldClockModel worldClockModel = new WorldClockModel();
                while (true) {
                    if (eventType != 3 || !xml.getName().equals("item")) {
                        if (eventType == 2) {
                            String name = xml.getName();
                            if ("worldClockCityName".equals(name)) {
                                xml.next();
                                String text = xml.getText();
                                f.d("cityResourceNameKey : " + text);
                                String stringResourceByName = t.getStringResourceByName(text);
                                worldClockModel.setKeyName(text);
                                worldClockModel.setCity(stringResourceByName);
                            }
                            if ("latitude".equals(name)) {
                                xml.next();
                                String text2 = xml.getText();
                                f.d("latitude : " + text2);
                                worldClockModel.setLatitude(Double.parseDouble(text2));
                            }
                            if ("longitude".equals(name)) {
                                xml.next();
                                String text3 = xml.getText();
                                f.d("longitude : " + text3);
                                worldClockModel.setLongitude(Double.parseDouble(text3));
                                arrayList.add(worldClockModel);
                            }
                            if ("timeZoneIdentifier".equals(name)) {
                                xml.next();
                                String text4 = xml.getText();
                                Log.e("WorldClock", "Identifier：" + text4);
                                worldClockModel.setSeconds(getTimeIntervalSecondsWithGreenwich(text4));
                                worldClockModel.setTimeIdentifier(text4);
                            }
                        }
                        eventType = xml.next();
                    }
                }
            }
            eventType = xml.next();
        }
        return arrayList;
    }

    public static long getCurrentTime(String str) {
        TimeZone timeZone = TimeZone.getTimeZone(str);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(timeZone);
        return calendar.getTime().getTime();
    }

    public static int getTimeIntervalSecondsWithGreenwich(String str) {
        int offset = TimeZone.getTimeZone(str).getOffset(System.currentTimeMillis()) / 1000;
        Log.e("WorldClockLog", "TimeIntervalWithGreenwich：" + offset);
        return offset;
    }

    public static int getTimeIntervalWithLocal(String str) {
        int offset = TimeZone.getDefault().getOffset(System.currentTimeMillis()) / 1000;
        Log.e("WorldClockLog", "DefaultTimeZone:" + offset);
        int offset2 = TimeZone.getTimeZone(str).getOffset(System.currentTimeMillis()) / 1000;
        Log.e("WorldClockLog", "TargetTimeZone:" + offset2);
        int i8 = offset2 - offset;
        Log.e("WorldClockLog", "Time:" + i8);
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$checkSavedWorldClockTimeZone$0() {
        try {
            List<WorldClockModel> allClock = getAllClock();
            WorldClockDaoProxy worldClockDaoProxy = new WorldClockDaoProxy();
            List<WorldClock> all = worldClockDaoProxy.getAll();
            if (x0.isNotEmpty(all)) {
                for (int i8 = 0; i8 < all.size(); i8++) {
                    WorldClock worldClock = all.get(i8);
                    Log.e("WorldClockLog", new Gson().toJson(worldClock));
                    int intValue = worldClock.getJetLag().intValue();
                    int intValue2 = worldClock.getTimeZone().intValue();
                    String timeZoneIdentifier = worldClock.getTimeZoneIdentifier();
                    if (TextUtils.isEmpty(timeZoneIdentifier) && x0.isNotEmpty(allClock)) {
                        for (WorldClockModel worldClockModel : allClock) {
                            if (worldClockModel.getKeyName().equals(worldClock.getCityKey())) {
                                timeZoneIdentifier = worldClockModel.getTimeIdentifier();
                                worldClock.setTimeZoneIdentifier(timeZoneIdentifier);
                                worldClockDaoProxy.insert(worldClock);
                            }
                        }
                    }
                    int timeIntervalSecondsWithGreenwich = getTimeIntervalSecondsWithGreenwich(timeZoneIdentifier);
                    int timeIntervalWithLocal = getTimeIntervalWithLocal(timeZoneIdentifier);
                    if (intValue != timeIntervalWithLocal || intValue2 != timeIntervalSecondsWithGreenwich) {
                        worldClock.setTimeZone(Integer.valueOf(timeIntervalSecondsWithGreenwich));
                        worldClock.setJetLag(Integer.valueOf(timeIntervalWithLocal));
                        worldClockDaoProxy.insert(worldClock);
                        i4.getInstance().sendWorldClock(WorldClockConvert.convertCRPWorldClock(worldClock));
                    }
                }
            }
        } catch (IOException e8) {
            e = e8;
            throw new RuntimeException(e);
        } catch (XmlPullParserException e9) {
            e = e9;
            throw new RuntimeException(e);
        }
    }
}
