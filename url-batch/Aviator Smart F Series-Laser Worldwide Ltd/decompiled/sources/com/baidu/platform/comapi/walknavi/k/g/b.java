package com.baidu.platform.comapi.walknavi.k.g;

import android.app.Activity;
import android.content.res.XmlResourceParser;
import android.util.Log;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private com.baidu.mapapi.walknavi.model.c f10283a;

    /* renamed from: b, reason: collision with root package name */
    private com.baidu.mapapi.walknavi.model.b f10284b;

    /* renamed from: c, reason: collision with root package name */
    private com.baidu.mapapi.walknavi.model.a f10285c;

    /* renamed from: d, reason: collision with root package name */
    private com.baidu.mapapi.bikenavi.model.c f10286d;

    /* renamed from: e, reason: collision with root package name */
    private com.baidu.mapapi.bikenavi.model.b f10287e;

    /* renamed from: f, reason: collision with root package name */
    private com.baidu.mapapi.bikenavi.model.a f10288f;

    /* renamed from: com.baidu.platform.comapi.walknavi.k.g.b$b, reason: collision with other inner class name */
    static class C0130b {

        /* renamed from: a, reason: collision with root package name */
        static final b f10289a = new b();
    }

    public static b a() {
        return C0130b.f10289a;
    }

    private void b(XmlPullParser xmlPullParser, int i8, int i9) {
        if (xmlPullParser == null || i8 < 0 || i9 != 5 || this.f10287e == null) {
            return;
        }
        if ("BMSDK_TEXT_SPEED".equals(xmlPullParser.getAttributeValue(i8))) {
            this.f10287e.a(xmlPullParser.getAttributeValue(xmlPullParser.getAttributeNamespace(i8), "id"));
        }
        if ("BMSDK_TEXT_SPEED_UNIT".equals(xmlPullParser.getAttributeValue(i8))) {
            this.f10287e.b(xmlPullParser.getAttributeValue(xmlPullParser.getAttributeNamespace(i8), "id"));
        }
    }

    private void c(XmlPullParser xmlPullParser, int i8, int i9) {
        if (xmlPullParser == null || i8 < 0 || i9 != 4 || this.f10286d == null) {
            return;
        }
        if ("BMSDK_LAYOUT_GPS".equals(xmlPullParser.getAttributeValue(i8))) {
            this.f10286d.c(xmlPullParser.getAttributeValue(xmlPullParser.getAttributeNamespace(i8), "id"));
        }
        if ("BMSDK_IMAGE_BGUIDANCE_ICON".equals(xmlPullParser.getAttributeValue(i8))) {
            this.f10286d.d(xmlPullParser.getAttributeValue(xmlPullParser.getAttributeNamespace(i8), "id"));
        }
        if ("BMSDK_TEXT_BGUIDANCE_TV".equals(xmlPullParser.getAttributeValue(i8))) {
            this.f10286d.e(xmlPullParser.getAttributeValue(xmlPullParser.getAttributeNamespace(i8), "id"));
        }
        if ("BMSDK_TEXT_BGPS_WEAK".equals(xmlPullParser.getAttributeValue(i8))) {
            this.f10286d.b(xmlPullParser.getAttributeValue(xmlPullParser.getAttributeNamespace(i8), "id"));
        }
        if ("BMSDK_TEXT_BGPS_HINT".equals(xmlPullParser.getAttributeValue(i8))) {
            this.f10286d.a(xmlPullParser.getAttributeValue(xmlPullParser.getAttributeNamespace(i8), "id"));
        }
    }

    private void d(XmlPullParser xmlPullParser, int i8, int i9) {
        if (xmlPullParser == null || i8 < 0 || i9 != 3 || this.f10285c == null) {
            return;
        }
        if ("BMSDK_LAYOUT_BOTSET_QUIT".equals(xmlPullParser.getAttributeValue(i8))) {
            this.f10285c.a(xmlPullParser.getAttributeValue(xmlPullParser.getAttributeNamespace(i8), "id"));
        }
        if ("BMSDK_IMAGE_QUIT_ICON".equals(xmlPullParser.getAttributeValue(i8))) {
            this.f10285c.c(xmlPullParser.getAttributeValue(xmlPullParser.getAttributeNamespace(i8), "id"));
        }
        if ("BMSDK_TEXT_QUIT_TV".equals(xmlPullParser.getAttributeValue(i8))) {
            this.f10285c.d(xmlPullParser.getAttributeValue(xmlPullParser.getAttributeNamespace(i8), "id"));
        }
        if ("BMSDK_TEXT_LOOKOVER".equals(xmlPullParser.getAttributeValue(i8))) {
            this.f10285c.b(xmlPullParser.getAttributeValue(xmlPullParser.getAttributeNamespace(i8), "id"));
        }
        if ("BMSDK_TEXT_REMAIN_CONTENT".equals(xmlPullParser.getAttributeValue(i8))) {
            this.f10285c.e(xmlPullParser.getAttributeValue(xmlPullParser.getAttributeNamespace(i8), "id"));
        }
    }

    private void e(XmlPullParser xmlPullParser, int i8, int i9) {
        if (xmlPullParser == null || i8 < 0 || i9 != 2 || this.f10284b == null) {
            return;
        }
        if ("BMSDK_LAYOUT_CALORIE".equals(xmlPullParser.getAttributeValue(i8))) {
            this.f10284b.f(xmlPullParser.getAttributeValue(xmlPullParser.getAttributeNamespace(i8), "id"));
        }
        if ("BMSDK_TEXT_CALORIE_HINT".equals(xmlPullParser.getAttributeValue(i8))) {
            this.f10284b.a(xmlPullParser.getAttributeValue(xmlPullParser.getAttributeNamespace(i8), "id"));
        }
        if ("BMSDK_IMAGE_CALORIE_ICON".equals(xmlPullParser.getAttributeValue(i8))) {
            this.f10284b.b(xmlPullParser.getAttributeValue(xmlPullParser.getAttributeNamespace(i8), "id"));
        }
        if ("BMSDK_TEXT_CONSUME_CALORIE_TIMES".equals(xmlPullParser.getAttributeValue(i8))) {
            this.f10284b.d(xmlPullParser.getAttributeValue(xmlPullParser.getAttributeNamespace(i8), "id"));
        }
        if ("BMSDK_LAYOUT_CALORIE_BTN".equals(xmlPullParser.getAttributeValue(i8))) {
            this.f10284b.e(xmlPullParser.getAttributeValue(xmlPullParser.getAttributeNamespace(i8), "id"));
        }
        if ("BMSDK_TEXT_CALORIE_NUMBER".equals(xmlPullParser.getAttributeValue(i8))) {
            this.f10284b.c(xmlPullParser.getAttributeValue(xmlPullParser.getAttributeNamespace(i8), "id"));
        }
        if ("BMSDK_TEXT_CALORIE_UNIT".equals(xmlPullParser.getAttributeValue(i8))) {
            this.f10284b.g(xmlPullParser.getAttributeValue(xmlPullParser.getAttributeNamespace(i8), "id"));
        }
    }

    private void f(XmlPullParser xmlPullParser, int i8, int i9) {
        if (xmlPullParser == null || i8 < 0 || i9 != 1 || this.f10283a == null) {
            return;
        }
        if ("BMSDK_LAYOUT_GUIDE".equals(xmlPullParser.getAttributeValue(i8))) {
            this.f10283a.f(xmlPullParser.getAttributeValue(xmlPullParser.getAttributeNamespace(i8), "id"));
        }
        if ("BMSDK_LAYOUT_GUIDE".equals(xmlPullParser.getAttributeValue(i8))) {
            this.f10283a.e(xmlPullParser.getAttributeValue(xmlPullParser.getAttributeNamespace(i8), "background"));
        }
        if ("BMSDK_IMAGE_IVICON".equals(xmlPullParser.getAttributeValue(i8))) {
            this.f10283a.d(xmlPullParser.getAttributeValue(xmlPullParser.getAttributeNamespace(i8), "id"));
        }
        if ("BMSDK_LAYOUT_GPS_WEAK".equals(xmlPullParser.getAttributeValue(i8))) {
            this.f10283a.c(xmlPullParser.getAttributeValue(xmlPullParser.getAttributeNamespace(i8), "id"));
        }
        if ("BMSDK_TEXT_GUIDE_REMAIN".equals(xmlPullParser.getAttributeValue(i8))) {
            this.f10283a.g(xmlPullParser.getAttributeValue(xmlPullParser.getAttributeNamespace(i8), "id"));
        }
        if ("BMSDK_TEXT_GUIDE".equals(xmlPullParser.getAttributeValue(i8))) {
            this.f10283a.h(xmlPullParser.getAttributeValue(xmlPullParser.getAttributeNamespace(i8), "id"));
        }
        if ("BMSDK_TEXT_GPS_WEAK".equals(xmlPullParser.getAttributeValue(i8))) {
            this.f10283a.b(xmlPullParser.getAttributeValue(xmlPullParser.getAttributeNamespace(i8), "id"));
        }
        if ("BMSDK_TEXT_GPS_HINT".equals(xmlPullParser.getAttributeValue(i8))) {
            this.f10283a.a(xmlPullParser.getAttributeValue(xmlPullParser.getAttributeNamespace(i8), "id"));
        }
    }

    private void g(XmlPullParser xmlPullParser, int i8, int i9) {
        if (xmlPullParser == null || i8 <= 0) {
            return;
        }
        for (int i10 = 0; i10 < i8; i10++) {
            if ("tag".equals(xmlPullParser.getAttributeName(i10))) {
                switch (i9) {
                    case 1:
                        f(xmlPullParser, i10, i9);
                        break;
                    case 2:
                        e(xmlPullParser, i10, i9);
                        break;
                    case 3:
                        d(xmlPullParser, i10, i9);
                        break;
                    case 4:
                        c(xmlPullParser, i10, i9);
                        break;
                    case 5:
                        b(xmlPullParser, i10, i9);
                        break;
                    case 6:
                        a(xmlPullParser, i10, i9);
                        break;
                }
            }
        }
    }

    private b() {
        this.f10283a = null;
        this.f10284b = null;
        this.f10285c = null;
        this.f10286d = null;
        this.f10287e = null;
        this.f10288f = null;
    }

    public boolean a(Activity activity, int i8, int i9, com.baidu.platform.comapi.walknavi.k.f.b bVar) {
        a(i8);
        if (activity == null) {
            Log.i("CustomWNaviView", "Current Activity is null");
            return false;
        }
        XmlResourceParser layout = activity.getResources().getLayout(i9);
        if (layout == null) {
            Log.i("CustomWNaviView", "Load parser layout resource failed.");
            return false;
        }
        try {
            for (int eventType = layout.getEventType(); eventType != 1; eventType = layout.next()) {
                if (eventType == 0) {
                    Log.i("CustomWNaviView", "START_DOCUMENT - " + layout.getName());
                } else if (eventType == 2) {
                    Log.i("CustomWNaviView", "START_TAG -- " + layout.getName());
                    g(layout, layout.getAttributeCount(), i8);
                } else if (eventType == 3) {
                    Log.i("CustomWNaviView", "END_TAG --" + layout.getName());
                }
            }
            Log.i("CustomWNaviView", "END_DOCUMENT - " + layout.getName());
            a(i8, bVar);
            return true;
        } catch (IOException e8) {
            e8.printStackTrace();
            Log.i("CustomWNaviView", "layout parser failed.");
            return false;
        } catch (XmlPullParserException e9) {
            e9.printStackTrace();
            Log.i("CustomWNaviView", "layout parser failed.");
            return false;
        }
    }

    private void a(int i8) {
        if (i8 <= 0) {
        }
        switch (i8) {
            case 1:
                this.f10283a = new com.baidu.mapapi.walknavi.model.c();
                break;
            case 2:
                this.f10284b = new com.baidu.mapapi.walknavi.model.b();
                break;
            case 3:
                this.f10285c = new com.baidu.mapapi.walknavi.model.a();
                break;
            case 4:
                this.f10286d = new com.baidu.mapapi.bikenavi.model.c();
                break;
            case 5:
                this.f10287e = new com.baidu.mapapi.bikenavi.model.b();
                break;
            case 6:
                this.f10288f = new com.baidu.mapapi.bikenavi.model.a();
                break;
        }
    }

    public void a(int i8, com.baidu.platform.comapi.walknavi.k.f.b bVar) {
        if (i8 <= 0 || bVar == null) {
            return;
        }
        switch (i8) {
            case 1:
                ((com.baidu.platform.comapi.walknavi.widget.c) bVar).a(this.f10283a);
                break;
            case 2:
                ((com.baidu.platform.comapi.walknavi.k.f.c) bVar).a(this.f10284b);
                break;
            case 3:
                ((com.baidu.platform.comapi.walknavi.k.f.c) bVar).a(this.f10285c);
                break;
            case 4:
                ((com.baidu.platform.comapi.bikenavi.widget.b) bVar).a(this.f10286d);
                break;
            case 5:
                ((com.baidu.platform.comapi.bikenavi.widget.a) bVar).a(this.f10287e);
                break;
            case 6:
                ((com.baidu.platform.comapi.bikenavi.widget.a) bVar).a(this.f10288f);
                break;
        }
    }

    private void a(XmlPullParser xmlPullParser, int i8, int i9) {
        if (xmlPullParser == null || i8 < 0 || i9 != 6 || this.f10288f == null) {
            return;
        }
        if ("BMSDK_IMAGE_QUIT_ICON".equals(xmlPullParser.getAttributeValue(i8))) {
            this.f10288f.c(xmlPullParser.getAttributeValue(xmlPullParser.getAttributeNamespace(i8), "id"));
        }
        if ("BMSDK_TEXT_LOOKOVER".equals(xmlPullParser.getAttributeValue(i8))) {
            this.f10288f.b(xmlPullParser.getAttributeValue(xmlPullParser.getAttributeNamespace(i8), "id"));
        }
        if ("BMSDK_TEXT_REMAIN".equals(xmlPullParser.getAttributeValue(i8))) {
            this.f10288f.a(xmlPullParser.getAttributeValue(xmlPullParser.getAttributeNamespace(i8), "id"));
        }
    }
}
