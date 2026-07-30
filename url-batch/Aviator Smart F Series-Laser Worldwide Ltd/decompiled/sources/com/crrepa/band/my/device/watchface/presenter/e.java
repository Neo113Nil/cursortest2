package com.crrepa.band.my.device.watchface.presenter;

import android.annotation.SuppressLint;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.text.TextUtils;
import androidx.core.graphics.PathParser;
import com.crrepa.band.my.model.WatchFaceSvgModel;
import com.crrepa.band.my.model.WatchFaceSvgPathModel;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Random;

/* loaded from: classes2.dex */
public class e implements com.moyoung.dafit.module.common.baseui.f {
    private static final String COLOR_BLACK = "#000000";
    public static final String NAME_SPACE = "http://schemas.android.com/apk/res/android";
    public static final String XML_KEY_CLIP_TYPE = "strokeMiterLimit";
    public static final String XML_KEY_FILL_ALPHA = "fillAlpha";
    public static final String XML_KEY_FILL_TYPE = "fillType";
    public static final String XML_KEY_NAME = "name";
    public static final String XML_KEY_PATH_DATA = "pathData";
    public static final String XML_KEY_VIEWPORT_HEIGHT = "viewportHeight";
    public static final String XML_KEY_VIEWPORT_WIDTH = "viewportWidth";
    public static final String XML_TAG_PATH = "path";
    public static final String XML_TAG_VECTOR = "vector";
    x1.b watchFaceView;

    class a implements Observer {
        a() {
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            th.printStackTrace();
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
        }

        @Override // io.reactivex.Observer
        public void onNext(ArrayList<WatchFaceSvgModel> arrayList) {
            e eVar = e.this;
            eVar.watchFaceView.renderRecommendWatchFace(eVar.getRandomSvgPicture(arrayList));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayList<WatchFaceSvgModel> getRandomSvgPicture(ArrayList<WatchFaceSvgModel> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int nextInt = new Random().nextInt(3) + 1;
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            WatchFaceSvgModel watchFaceSvgModel = arrayList.get(i8);
            if (watchFaceSvgModel.getColorNumber() == nextInt) {
                arrayList2.add(watchFaceSvgModel);
            }
        }
        if (!arrayList2.isEmpty()) {
            ArrayList arrayList3 = new ArrayList();
            for (int i9 = 0; i9 < 5; i9++) {
                int nextInt2 = new Random().nextInt(arrayList2.size());
                while (arrayList3.contains(Integer.valueOf(nextInt2))) {
                    nextInt2 = new Random().nextInt(arrayList2.size());
                }
                arrayList3.add(Integer.valueOf(nextInt2));
            }
            arrayList.clear();
            for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                arrayList.add((WatchFaceSvgModel) arrayList2.get(((Integer) arrayList3.get(i10)).intValue()));
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ArrayList lambda$startParseXml$0(ArrayList arrayList, int[] iArr) {
        ArrayList arrayList2 = new ArrayList();
        for (int i8 : iArr) {
            WatchFaceSvgModel resolveXmlToBean = resolveXmlToBean(com.moyoung.dafit.module.common.utils.d.get().getResources().getXml(i8), arrayList);
            if (resolveXmlToBean != null) {
                arrayList2.add(resolveXmlToBean);
            }
        }
        return arrayList2;
    }

    @SuppressLint({"RestrictedApi"})
    private WatchFaceSvgModel resolveXmlToBean(XmlResourceParser xmlResourceParser, ArrayList<String> arrayList) {
        WatchFaceSvgModel watchFaceSvgModel = new WatchFaceSvgModel();
        ArrayList<WatchFaceSvgPathModel> arrayList2 = new ArrayList<>();
        while (true) {
            int eventType = xmlResourceParser.getEventType();
            if (eventType == 1) {
                break;
            }
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (XML_TAG_VECTOR.equals(name)) {
                    int parseInt = Integer.parseInt(xmlResourceParser.getAttributeValue(NAME_SPACE, "name").substring(0, 2));
                    if (arrayList.size() < parseInt) {
                        break;
                    }
                    String attributeValue = xmlResourceParser.getAttributeValue(NAME_SPACE, XML_KEY_VIEWPORT_WIDTH);
                    String attributeValue2 = xmlResourceParser.getAttributeValue(NAME_SPACE, XML_KEY_VIEWPORT_HEIGHT);
                    watchFaceSvgModel.setSvgWidth((int) Float.parseFloat(attributeValue));
                    watchFaceSvgModel.setSvgHeight((int) Float.parseFloat(attributeValue2));
                    watchFaceSvgModel.setColorNumber(parseInt);
                }
                if ("path".equals(name)) {
                    WatchFaceSvgPathModel watchFaceSvgPathModel = new WatchFaceSvgPathModel();
                    String attributeValue3 = xmlResourceParser.getAttributeValue(NAME_SPACE, "name");
                    String attributeValue4 = xmlResourceParser.getAttributeValue(NAME_SPACE, XML_KEY_PATH_DATA);
                    String attributeValue5 = xmlResourceParser.getAttributeValue(NAME_SPACE, XML_KEY_FILL_ALPHA);
                    String attributeValue6 = xmlResourceParser.getAttributeValue(NAME_SPACE, XML_KEY_CLIP_TYPE);
                    String attributeValue7 = xmlResourceParser.getAttributeValue(NAME_SPACE, XML_KEY_FILL_TYPE);
                    String str = arrayList.get(Integer.parseInt(attributeValue3.substring(2, 4)) - 1);
                    watchFaceSvgPathModel.setId(name);
                    watchFaceSvgPathModel.setColor(str);
                    Path createPathFromPathData = PathParser.createPathFromPathData(attributeValue4);
                    if (!TextUtils.isEmpty(attributeValue7)) {
                        createPathFromPathData.setFillType(Path.FillType.EVEN_ODD);
                    }
                    watchFaceSvgPathModel.setPath(createPathFromPathData);
                    watchFaceSvgPathModel.setClipPath(attributeValue6 != null);
                    if (!TextUtils.isEmpty(attributeValue5)) {
                        watchFaceSvgPathModel.setFillAlpha(attributeValue5);
                    }
                    arrayList2.add(watchFaceSvgPathModel);
                }
                if (arrayList.size() == 1 && arrayList.get(0).equals(COLOR_BLACK)) {
                    watchFaceSvgModel.setPureBlack(true);
                }
            }
            xmlResourceParser.next();
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        watchFaceSvgModel.setPathModels(arrayList2);
        return watchFaceSvgModel;
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void pause() {
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void resume() {
    }

    public void setView(x1.b bVar) {
        this.watchFaceView = bVar;
    }

    @SuppressLint({"RestrictedApi"})
    public void startParseXml(final ArrayList<String> arrayList, int[] iArr) {
        Observable.fromArray(iArr).map(new Function() { // from class: com.crrepa.band.my.device.watchface.presenter.d
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                ArrayList lambda$startParseXml$0;
                lambda$startParseXml$0 = e.this.lambda$startParseXml$0(arrayList, (int[]) obj);
                return lambda$startParseXml$0;
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new a());
    }
}
