package d2;

import android.annotation.SuppressLint;
import android.content.res.XmlResourceParser;
import android.util.Log;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.model.WorldClockModel;
import com.moyoung.dafit.module.common.baseui.f;
import com.moyoung.dafit.module.common.utils.t;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class c implements f {
    public static final String XML_TAG_CITY_NAME = "worldClockCityName";
    public static final String XML_TAG_IDENTIFIER = "timeZoneIdentifier";
    public static final String XML_TAG_ITEM = "item";
    public static final String XML_TAG_LATITUDE = "latitude";
    public static final String XML_TAG_LONGITUDE = "longitude";
    private Disposable clockSubscribe;
    private f2.a view;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getAllClock$0(ObservableEmitter observableEmitter) {
        XmlResourceParser xml = com.moyoung.dafit.module.common.utils.d.get().getResources().getXml(R.xml.world_clock_time_zone_list);
        ArrayList arrayList = new ArrayList();
        int eventType = xml.getEventType();
        while (eventType != 1) {
            if (eventType == 2 && xml.getName().equals("item")) {
                WorldClockModel worldClockModel = new WorldClockModel();
                while (true) {
                    if (eventType != 3 || !xml.getName().equals("item")) {
                        if (eventType == 2) {
                            String name = xml.getName();
                            if (XML_TAG_CITY_NAME.equals(name)) {
                                xml.next();
                                String text = xml.getText();
                                com.orhanobut.logger.f.d("cityResourceNameKey : " + text);
                                String stringResourceByName = t.getStringResourceByName(text);
                                worldClockModel.setKeyName(text);
                                worldClockModel.setCity(stringResourceByName);
                            }
                            if (XML_TAG_LATITUDE.equals(name)) {
                                xml.next();
                                String text2 = xml.getText();
                                com.orhanobut.logger.f.d("latitude : " + text2);
                                worldClockModel.setLatitude(Double.parseDouble(text2));
                            }
                            if (XML_TAG_LONGITUDE.equals(name)) {
                                xml.next();
                                String text3 = xml.getText();
                                com.orhanobut.logger.f.d("longitude : " + text3);
                                worldClockModel.setLongitude(Double.parseDouble(text3));
                                arrayList.add(worldClockModel);
                            }
                            if (XML_TAG_IDENTIFIER.equals(name)) {
                                xml.next();
                                String text4 = xml.getText();
                                Log.e("WorldClock", "Identifier：" + text4);
                                worldClockModel.setSeconds(e2.b.getTimeIntervalSecondsWithGreenwich(text4));
                                worldClockModel.setTimeIdentifier(text4);
                            }
                        }
                        eventType = xml.next();
                    }
                }
            }
            eventType = xml.next();
        }
        observableEmitter.onNext(arrayList);
        observableEmitter.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getAllClock$1(List list) {
        f2.a aVar = this.view;
        if (aVar != null) {
            aVar.renderClockList(list);
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
        this.view = null;
        Disposable disposable = this.clockSubscribe;
        if (disposable == null || disposable.isDisposed()) {
            return;
        }
        this.clockSubscribe.dispose();
    }

    @SuppressLint({"CheckResult"})
    public void getAllClock() {
        this.clockSubscribe = Observable.create(new ObservableOnSubscribe() { // from class: d2.a
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                c.lambda$getAllClock$0(observableEmitter);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: d2.b
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                c.this.lambda$getAllClock$1((List) obj);
            }
        });
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void pause() {
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void resume() {
    }

    public void setView(f2.a aVar) {
        this.view = aVar;
    }
}
