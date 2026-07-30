package v3;

import android.util.Log;
import android.util.Xml;
import cn.hutool.core.date.d;
import cn.hutool.core.util.l;
import com.crrepa.band.my.model.gps.TrainingLocation;
import com.crrepa.band.my.profile.strava.model.GPXContentBean;
import com.github.mikephil.charting.utils.i;
import com.google.gson.Gson;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes2.dex */
public class a {
    private static double calculateDistance(double d8, double d9, double d10, double d11) {
        double radians = Math.toRadians(d10 - d8);
        double d12 = radians / 2.0d;
        double radians2 = Math.toRadians(d11 - d9) / 2.0d;
        double sin = (Math.sin(d12) * Math.sin(d12)) + (Math.cos(Math.toRadians(d8)) * Math.cos(Math.toRadians(d10)) * Math.sin(radians2) * Math.sin(radians2));
        return Math.atan2(Math.sqrt(sin), Math.sqrt(1.0d - sin)) * 2.0d * 6371.0d * 1000.0d;
    }

    public static List<GPXContentBean> checkPausePoint(List<GPXContentBean> list) {
        if (list != null) {
            if (list.size() > 1) {
                Iterator<GPXContentBean> it = list.iterator();
                while (it.hasNext()) {
                    Log.d("checkPausePoint", "bean=" + new Gson().toJson(it.next()));
                }
                GPXContentBean gPXContentBean = list.get(0);
                if (gPXContentBean.getLatitude() == 200.0d && gPXContentBean.getLongitude() == 200.0d) {
                    GPXContentBean gPXContentBean2 = gPXContentBean;
                    for (GPXContentBean gPXContentBean3 : list) {
                        if (gPXContentBean3.getLatitude() != 200.0d && gPXContentBean3.getLongitude() != 200.0d) {
                            gPXContentBean2 = gPXContentBean3;
                        }
                    }
                    gPXContentBean.setLatitude(gPXContentBean2.getLatitude());
                    gPXContentBean.setLongitude(gPXContentBean2.getLongitude());
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(gPXContentBean);
                for (int i8 = 1; i8 < list.size(); i8++) {
                    GPXContentBean gPXContentBean4 = list.get(i8 - 1);
                    GPXContentBean gPXContentBean5 = list.get(i8);
                    if (gPXContentBean5.getLatitude() == 200.0d && gPXContentBean5.getLongitude() == 200.0d) {
                        gPXContentBean5.setLatitude(gPXContentBean4.getLatitude());
                        gPXContentBean5.setLongitude(gPXContentBean4.getLongitude());
                    }
                    if (gPXContentBean5.getLatitude() == i.DOUBLE_EPSILON && gPXContentBean5.getLongitude() == i.DOUBLE_EPSILON) {
                        gPXContentBean5.setLatitude(gPXContentBean4.getLatitude());
                        gPXContentBean5.setLongitude(gPXContentBean4.getLongitude());
                    }
                    GPXContentBean gPXContentBean6 = new GPXContentBean(gPXContentBean5.getLatitude(), gPXContentBean5.getLongitude(), gPXContentBean5.getAltitude(), gPXContentBean5.getTimestamp(), gPXContentBean5.getSpeed());
                    Log.d("checkPausePoint", "oldCurrent=" + new Gson().toJson(gPXContentBean5));
                    Log.d("checkPausePoint", "newCurrent=" + new Gson().toJson(gPXContentBean6));
                    arrayList.add(gPXContentBean6);
                }
                return arrayList;
            }
        }
        return list;
    }

    public static boolean createGPXFile(String str, List<GPXContentBean> list) {
        File file = new File(str);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                XmlSerializer newSerializer = Xml.newSerializer();
                newSerializer.setOutput(fileOutputStream, l.UTF_8);
                newSerializer.startDocument(null, Boolean.TRUE);
                newSerializer.startTag(null, "gpx");
                newSerializer.attribute(null, "xmlns", "http://www.topografix.com/GPX/1/1");
                newSerializer.attribute(null, "version", "1.1");
                newSerializer.attribute(null, "creator", "MyGPXCreator");
                newSerializer.startTag(null, "trk");
                newSerializer.startTag(null, "name").text(file.getName()).endTag(null, "name");
                newSerializer.startTag(null, "trkseg");
                for (GPXContentBean gPXContentBean : list) {
                    newSerializer.startTag(null, "trkpt");
                    newSerializer.attribute(null, "lat", String.valueOf(gPXContentBean.getLatitude()));
                    newSerializer.attribute(null, "lon", String.valueOf(gPXContentBean.getLongitude()));
                    newSerializer.startTag(null, "ele").text(String.valueOf(gPXContentBean.getAltitude())).endTag(null, "ele");
                    newSerializer.startTag(null, "time").text(new SimpleDateFormat(d.UTC_PATTERN, Locale.US).format(Long.valueOf(gPXContentBean.getTimestamp()))).endTag(null, "time");
                    newSerializer.endTag(null, "trkpt");
                }
                newSerializer.endTag(null, "trkseg");
                newSerializer.endTag(null, "trk");
                newSerializer.endTag(null, "gpx");
                newSerializer.endDocument();
                System.out.println("GPX文件已成功创建！");
                fileOutputStream.close();
                return true;
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException | IllegalArgumentException e8) {
            e8.printStackTrace();
            return false;
        }
    }

    public static int getStaticPointSize(List<TrainingLocation> list) {
        int i8;
        int i9 = 0;
        if (list != null) {
            if (list.size() > 1) {
                while (i8 < list.size()) {
                    TrainingLocation trainingLocation = list.get(i8 - 1);
                    TrainingLocation trainingLocation2 = list.get(i8);
                    if (trainingLocation2.getLatitude() == 200.0d && trainingLocation2.getLongitude() == 200.0d) {
                        trainingLocation2.setLatitude(trainingLocation.getLatitude());
                        trainingLocation2.setLongitude(trainingLocation.getLongitude());
                    } else if (trainingLocation2.getLatitude() == i.DOUBLE_EPSILON && trainingLocation2.getLongitude() == i.DOUBLE_EPSILON) {
                        trainingLocation2.setLatitude(trainingLocation.getLatitude());
                        trainingLocation2.setLongitude(trainingLocation.getLongitude());
                    } else if (trainingLocation2.getTimestamp() == trainingLocation.getTimestamp()) {
                        Log.d("getStaticPointSize", "timestamp is equal");
                    } else {
                        i8 = calculateDistance(trainingLocation.getLatitude(), trainingLocation.getLongitude(), trainingLocation2.getLatitude(), trainingLocation2.getLongitude()) > 0.2d ? i8 + 1 : 1;
                    }
                    i9++;
                }
            }
        }
        return i9;
    }
}
