package A0;

import B0.m;
import B0.o;
import B0.p;
import E.AbstractC0003d;
import E.AbstractC0005f;
import E.AbstractC0014o;
import E1.A;
import E1.AbstractActivityC0029e;
import E1.B;
import E1.C;
import E1.D;
import E1.t;
import E1.z;
import K0.j;
import P1.k;
import P1.u;
import U.AbstractC0065a;
import U.C0066b;
import U1.C0080a;
import W1.C0094f;
import W1.C0096h;
import W1.InterfaceC0095g;
import W1.K;
import W1.L;
import W1.O;
import Y1.M;
import a.AbstractC0129a;
import a2.InterfaceC0133a;
import android.app.Activity;
import android.app.ActivityOptions;
import android.app.Notification;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Looper;
import android.text.Selection;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.core.graphics.drawable.IconCompat;
import androidx.lifecycle.E;
import androidx.lifecycle.F;
import androidx.recyclerview.widget.RecyclerView;
import b0.C0178i;
import b0.r;
import b2.C0195i;
import com.google.android.gms.internal.play_billing.C0229i;
import d2.InterfaceC0300c;
import e.C0309f;
import e1.C0311b;
import e1.InterfaceC0313d;
import e2.EnumC0317a;
import g1.C0332a;
import h.AbstractC0337a;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.editing.g;
import io.flutter.plugins.urllauncher.WebViewActivity;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.KotlinVersion;
import l.C1096s;
import l.t0;
import n0.C1125E;
import org.xmlpull.v1.XmlPullParserException;
import p.C1170f;
import p.C1173i;
import s0.C1184a;
import s0.C1185b;
import s0.EnumC1186c;
import t1.AbstractAsyncTaskC1190a;
import v0.h;
import v0.i;
import v0.n;
import w.InterfaceC1230a;
import x0.InterfaceC1239b;
import y0.C1251a;

/* loaded from: classes.dex */
public final class f implements InterfaceC1239b, P1.d, InterfaceC0095g, w2.d {

    /* renamed from: e, reason: collision with root package name */
    public static f f21e;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22a;

    /* renamed from: b, reason: collision with root package name */
    public Object f23b;

    /* renamed from: c, reason: collision with root package name */
    public Object f24c;

    /* renamed from: d, reason: collision with root package name */
    public Object f25d;

    public /* synthetic */ f(int i3, boolean z) {
        this.f22a = i3;
    }

    public static f H() {
        if (f21e == null) {
            j jVar = new j(5);
            D1.a aVar = new D1.a();
            aVar.f224a = 0;
            ExecutorService newCachedThreadPool = Executors.newCachedThreadPool(aVar);
            FlutterJNI flutterJNI = new FlutterJNI();
            J1.d dVar = new J1.d();
            dVar.f639a = false;
            dVar.f640b = false;
            dVar.f = flutterJNI;
            dVar.f644g = newCachedThreadPool;
            f fVar = new f(1, false);
            fVar.f23b = dVar;
            fVar.f24c = jVar;
            fVar.f25d = newCachedThreadPool;
            f21e = fVar;
        }
        return f21e;
    }

    public static f K(Context context, AttributeSet attributeSet, int[] iArr, int i3) {
        return new f(context, context.obtainStyledAttributes(attributeSet, iArr, i3, 0));
    }

    public static void T(P1.f fVar, final f fVar2) {
        X1.c cVar = X1.c.f1731a;
        p pVar = new p(fVar, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.canLaunchUrl", (k) cVar, (j) null);
        if (fVar2 != null) {
            final int i3 = 0;
            pVar.i(new P1.b(fVar2) { // from class: X1.d

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ A0.f f1733b;

                {
                    this.f1733b = fVar2;
                }

                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    switch (i3) {
                        case 0:
                            A0.f fVar3 = this.f1733b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, fVar3.u((String) ((ArrayList) obj).get(0)));
                            } catch (Throwable th) {
                                arrayList = AbstractC0129a.J(th);
                            }
                            eVar.n(arrayList);
                            break;
                        case 1:
                            A0.f fVar4 = this.f1733b;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, fVar4.J((String) arrayList3.get(0), (Map) arrayList3.get(1), (Boolean) arrayList3.get(2)));
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0129a.J(th2);
                            }
                            eVar.n(arrayList2);
                            break;
                        case 2:
                            A0.f fVar5 = this.f1733b;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, fVar5.N((String) arrayList5.get(0), (Boolean) arrayList5.get(1), (e) arrayList5.get(2), (a) arrayList5.get(3)));
                            } catch (Throwable th3) {
                                arrayList4 = AbstractC0129a.J(th3);
                            }
                            eVar.n(arrayList4);
                            break;
                        case 3:
                            A0.f fVar6 = this.f1733b;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, fVar6.U());
                            } catch (Throwable th4) {
                                arrayList6 = AbstractC0129a.J(th4);
                            }
                            eVar.n(arrayList6);
                            break;
                        default:
                            A0.f fVar7 = this.f1733b;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                fVar7.getClass();
                                ((Context) fVar7.f23b).sendBroadcast(new Intent("close action"));
                                arrayList7.add(0, null);
                            } catch (Throwable th5) {
                                arrayList7 = AbstractC0129a.J(th5);
                            }
                            eVar.n(arrayList7);
                            break;
                    }
                }
            });
        } else {
            pVar.i(null);
        }
        p pVar2 = new p(fVar, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.launchUrl", (k) cVar, (j) null);
        if (fVar2 != null) {
            final int i4 = 1;
            pVar2.i(new P1.b(fVar2) { // from class: X1.d

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ A0.f f1733b;

                {
                    this.f1733b = fVar2;
                }

                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    switch (i4) {
                        case 0:
                            A0.f fVar3 = this.f1733b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, fVar3.u((String) ((ArrayList) obj).get(0)));
                            } catch (Throwable th) {
                                arrayList = AbstractC0129a.J(th);
                            }
                            eVar.n(arrayList);
                            break;
                        case 1:
                            A0.f fVar4 = this.f1733b;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, fVar4.J((String) arrayList3.get(0), (Map) arrayList3.get(1), (Boolean) arrayList3.get(2)));
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0129a.J(th2);
                            }
                            eVar.n(arrayList2);
                            break;
                        case 2:
                            A0.f fVar5 = this.f1733b;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, fVar5.N((String) arrayList5.get(0), (Boolean) arrayList5.get(1), (e) arrayList5.get(2), (a) arrayList5.get(3)));
                            } catch (Throwable th3) {
                                arrayList4 = AbstractC0129a.J(th3);
                            }
                            eVar.n(arrayList4);
                            break;
                        case 3:
                            A0.f fVar6 = this.f1733b;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, fVar6.U());
                            } catch (Throwable th4) {
                                arrayList6 = AbstractC0129a.J(th4);
                            }
                            eVar.n(arrayList6);
                            break;
                        default:
                            A0.f fVar7 = this.f1733b;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                fVar7.getClass();
                                ((Context) fVar7.f23b).sendBroadcast(new Intent("close action"));
                                arrayList7.add(0, null);
                            } catch (Throwable th5) {
                                arrayList7 = AbstractC0129a.J(th5);
                            }
                            eVar.n(arrayList7);
                            break;
                    }
                }
            });
        } else {
            pVar2.i(null);
        }
        p pVar3 = new p(fVar, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.openUrlInApp", (k) cVar, (j) null);
        if (fVar2 != null) {
            final int i5 = 2;
            pVar3.i(new P1.b(fVar2) { // from class: X1.d

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ A0.f f1733b;

                {
                    this.f1733b = fVar2;
                }

                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    switch (i5) {
                        case 0:
                            A0.f fVar3 = this.f1733b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, fVar3.u((String) ((ArrayList) obj).get(0)));
                            } catch (Throwable th) {
                                arrayList = AbstractC0129a.J(th);
                            }
                            eVar.n(arrayList);
                            break;
                        case 1:
                            A0.f fVar4 = this.f1733b;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, fVar4.J((String) arrayList3.get(0), (Map) arrayList3.get(1), (Boolean) arrayList3.get(2)));
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0129a.J(th2);
                            }
                            eVar.n(arrayList2);
                            break;
                        case 2:
                            A0.f fVar5 = this.f1733b;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, fVar5.N((String) arrayList5.get(0), (Boolean) arrayList5.get(1), (e) arrayList5.get(2), (a) arrayList5.get(3)));
                            } catch (Throwable th3) {
                                arrayList4 = AbstractC0129a.J(th3);
                            }
                            eVar.n(arrayList4);
                            break;
                        case 3:
                            A0.f fVar6 = this.f1733b;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, fVar6.U());
                            } catch (Throwable th4) {
                                arrayList6 = AbstractC0129a.J(th4);
                            }
                            eVar.n(arrayList6);
                            break;
                        default:
                            A0.f fVar7 = this.f1733b;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                fVar7.getClass();
                                ((Context) fVar7.f23b).sendBroadcast(new Intent("close action"));
                                arrayList7.add(0, null);
                            } catch (Throwable th5) {
                                arrayList7 = AbstractC0129a.J(th5);
                            }
                            eVar.n(arrayList7);
                            break;
                    }
                }
            });
        } else {
            pVar3.i(null);
        }
        p pVar4 = new p(fVar, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.supportsCustomTabs", (k) cVar, (j) null);
        if (fVar2 != null) {
            final int i6 = 3;
            pVar4.i(new P1.b(fVar2) { // from class: X1.d

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ A0.f f1733b;

                {
                    this.f1733b = fVar2;
                }

                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    switch (i6) {
                        case 0:
                            A0.f fVar3 = this.f1733b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, fVar3.u((String) ((ArrayList) obj).get(0)));
                            } catch (Throwable th) {
                                arrayList = AbstractC0129a.J(th);
                            }
                            eVar.n(arrayList);
                            break;
                        case 1:
                            A0.f fVar4 = this.f1733b;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, fVar4.J((String) arrayList3.get(0), (Map) arrayList3.get(1), (Boolean) arrayList3.get(2)));
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0129a.J(th2);
                            }
                            eVar.n(arrayList2);
                            break;
                        case 2:
                            A0.f fVar5 = this.f1733b;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, fVar5.N((String) arrayList5.get(0), (Boolean) arrayList5.get(1), (e) arrayList5.get(2), (a) arrayList5.get(3)));
                            } catch (Throwable th3) {
                                arrayList4 = AbstractC0129a.J(th3);
                            }
                            eVar.n(arrayList4);
                            break;
                        case 3:
                            A0.f fVar6 = this.f1733b;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, fVar6.U());
                            } catch (Throwable th4) {
                                arrayList6 = AbstractC0129a.J(th4);
                            }
                            eVar.n(arrayList6);
                            break;
                        default:
                            A0.f fVar7 = this.f1733b;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                fVar7.getClass();
                                ((Context) fVar7.f23b).sendBroadcast(new Intent("close action"));
                                arrayList7.add(0, null);
                            } catch (Throwable th5) {
                                arrayList7 = AbstractC0129a.J(th5);
                            }
                            eVar.n(arrayList7);
                            break;
                    }
                }
            });
        } else {
            pVar4.i(null);
        }
        p pVar5 = new p(fVar, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.closeWebView", (k) cVar, (j) null);
        if (fVar2 == null) {
            pVar5.i(null);
        } else {
            final int i7 = 4;
            pVar5.i(new P1.b(fVar2) { // from class: X1.d

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ A0.f f1733b;

                {
                    this.f1733b = fVar2;
                }

                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    switch (i7) {
                        case 0:
                            A0.f fVar3 = this.f1733b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, fVar3.u((String) ((ArrayList) obj).get(0)));
                            } catch (Throwable th) {
                                arrayList = AbstractC0129a.J(th);
                            }
                            eVar.n(arrayList);
                            break;
                        case 1:
                            A0.f fVar4 = this.f1733b;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, fVar4.J((String) arrayList3.get(0), (Map) arrayList3.get(1), (Boolean) arrayList3.get(2)));
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0129a.J(th2);
                            }
                            eVar.n(arrayList2);
                            break;
                        case 2:
                            A0.f fVar5 = this.f1733b;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, fVar5.N((String) arrayList5.get(0), (Boolean) arrayList5.get(1), (e) arrayList5.get(2), (a) arrayList5.get(3)));
                            } catch (Throwable th3) {
                                arrayList4 = AbstractC0129a.J(th3);
                            }
                            eVar.n(arrayList4);
                            break;
                        case 3:
                            A0.f fVar6 = this.f1733b;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, fVar6.U());
                            } catch (Throwable th4) {
                                arrayList6 = AbstractC0129a.J(th4);
                            }
                            eVar.n(arrayList6);
                            break;
                        default:
                            A0.f fVar7 = this.f1733b;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                fVar7.getClass();
                                ((Context) fVar7.f23b).sendBroadcast(new Intent("close action"));
                                arrayList7.add(0, null);
                            } catch (Throwable th5) {
                                arrayList7 = AbstractC0129a.J(th5);
                            }
                            eVar.n(arrayList7);
                            break;
                    }
                }
            });
        }
    }

    public static Bundle z(Map map) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            bundle.putString(str, (String) map.get(str));
        }
        return bundle;
    }

    public int A(int i3, int i4) {
        ArrayList arrayList = (ArrayList) this.f25d;
        int size = arrayList.size();
        while (i4 < size) {
            ((AbstractC0065a) arrayList.get(i4)).getClass();
            i4++;
        }
        return i3;
    }

    public ColorStateList B(int i3) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f24c;
        if (typedArray.hasValue(i3) && (resourceId = typedArray.getResourceId(i3, 0)) != 0) {
            Object obj = AbstractC0337a.f5053a;
            ColorStateList colorStateList = ((Context) this.f23b).getColorStateList(resourceId);
            if (colorStateList != null) {
                return colorStateList;
            }
        }
        return typedArray.getColorStateList(i3);
    }

    public Drawable C(int i3) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f24c;
        return (!typedArray.hasValue(i3) || (resourceId = typedArray.getResourceId(i3, 0)) == 0) ? typedArray.getDrawable(i3) : AbstractC0337a.a((Context) this.f23b, resourceId);
    }

    public Typeface D(int i3, int i4, C1096s c1096s) {
        C1096s c1096s2;
        XmlPullParserException xmlPullParserException;
        IOException iOException;
        int i5 = 19;
        int resourceId = ((TypedArray) this.f24c).getResourceId(i3, 0);
        if (resourceId != 0) {
            if (((TypedValue) this.f25d) == null) {
                this.f25d = new TypedValue();
            }
            TypedValue typedValue = (TypedValue) this.f25d;
            Object obj = w.e.f10626a;
            Context context = (Context) this.f23b;
            if (!context.isRestricted()) {
                Resources resources = context.getResources();
                resources.getValue(resourceId, typedValue, true);
                CharSequence charSequence = typedValue.string;
                if (charSequence == null) {
                    throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(resourceId) + "\" (" + Integer.toHexString(resourceId) + ") is not a Font: " + typedValue);
                }
                String charSequence2 = charSequence.toString();
                if (!charSequence2.startsWith("res/")) {
                    c1096s.a();
                    return null;
                }
                int i6 = typedValue.assetCookie;
                C1173i c1173i = x.c.f10699b;
                Typeface typeface = (Typeface) c1173i.a(x.c.b(resources, resourceId, charSequence2, i6, i4));
                if (typeface != null) {
                    new Handler(Looper.getMainLooper()).post(new A1.a(c1096s, i5, typeface));
                    return typeface;
                }
                try {
                } catch (IOException e3) {
                    e = e3;
                    c1096s2 = c1096s;
                } catch (XmlPullParserException e4) {
                    e = e4;
                    c1096s2 = c1096s;
                }
                try {
                    if (!charSequence2.toLowerCase().endsWith(".xml")) {
                        int i7 = typedValue.assetCookie;
                        Typeface p3 = x.c.f10698a.p(context, resources, resourceId, charSequence2, i4);
                        if (p3 != null) {
                            c1173i.b(x.c.b(resources, resourceId, charSequence2, i7, i4), p3);
                        }
                        if (p3 != null) {
                            new Handler(Looper.getMainLooper()).post(new A1.a(c1096s, i5, p3));
                        } else {
                            c1096s.a();
                        }
                        return p3;
                    }
                    InterfaceC1230a w3 = S0.a.w(resources.getXml(resourceId), resources);
                    if (w3 != null) {
                        return x.c.a(context, w3, resources, resourceId, charSequence2, typedValue.assetCookie, i4, c1096s);
                    }
                    try {
                        Log.e("ResourcesCompat", "Failed to find font-family tag");
                        c1096s.a();
                        return null;
                    } catch (IOException e5) {
                        iOException = e5;
                        c1096s2 = c1096s;
                        Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                        c1096s2.a();
                        return null;
                    } catch (XmlPullParserException e6) {
                        xmlPullParserException = e6;
                        c1096s2 = c1096s;
                        Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                        c1096s2.a();
                        return null;
                    }
                } catch (IOException e7) {
                    e = e7;
                    iOException = e;
                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                    c1096s2.a();
                    return null;
                } catch (XmlPullParserException e8) {
                    e = e8;
                    xmlPullParserException = e;
                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                    c1096s2.a();
                    return null;
                }
            }
        }
        return null;
    }

    public View E(int i3) {
        return ((RecyclerView) ((C0.e) this.f23b).f201b).getChildAt(i3);
    }

    public int F() {
        return ((RecyclerView) ((C0.e) this.f23b).f201b).getChildCount();
    }

    public boolean G(KeyEvent keyEvent) {
        if (((HashSet) this.f24c).remove(keyEvent)) {
            return false;
        }
        C[] cArr = (C[]) this.f23b;
        if (cArr.length <= 0) {
            L(keyEvent);
            return true;
        }
        B b3 = new B();
        b3.f313d = this;
        b3.f311b = ((C[]) this.f23b).length;
        b3.f310a = false;
        b3.f312c = keyEvent;
        for (C c3 : cArr) {
            A a3 = new A();
            a3.f309b = b3;
            a3.f308a = false;
            c3.f(keyEvent, a3);
        }
        return true;
    }

    public void I(C0309f c0309f) {
        c.k kVar = (c.k) this.f23b;
        LinkedHashMap linkedHashMap = kVar.f2576b;
        String str = (String) this.f24c;
        Object obj = linkedHashMap.get(str);
        C0080a c0080a = (C0080a) this.f25d;
        if (obj == null) {
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + c0080a + " and input " + c0309f + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }
        int intValue = ((Number) obj).intValue();
        ArrayList arrayList = kVar.f2578d;
        arrayList.add(str);
        try {
            kVar.b(intValue, c0080a, c0309f);
        } catch (Exception e3) {
            arrayList.remove(str);
            throw e3;
        }
    }

    public Boolean J(String str, Map map, Boolean bool) {
        if (((AbstractActivityC0029e) this.f25d) == null) {
            throw new X1.b();
        }
        Intent putExtra = new Intent("android.intent.action.VIEW").setData(Uri.parse(str)).putExtra("com.android.browser.headers", z(map));
        if (bool.booleanValue() && Build.VERSION.SDK_INT >= 30) {
            putExtra.addFlags(1024);
        }
        try {
            ((AbstractActivityC0029e) this.f25d).startActivity(putExtra);
            return Boolean.TRUE;
        } catch (ActivityNotFoundException unused) {
            return Boolean.FALSE;
        }
    }

    public void L(KeyEvent keyEvent) {
        InputConnection inputConnection;
        D d3 = (D) this.f25d;
        if (d3 != null) {
            io.flutter.plugin.editing.k kVar = ((t) d3).f395l;
            boolean z = false;
            if (kVar.f9214b.isAcceptingText() && (inputConnection = kVar.f9221j) != null) {
                if (inputConnection instanceof io.flutter.plugin.editing.d) {
                    io.flutter.plugin.editing.d dVar = (io.flutter.plugin.editing.d) inputConnection;
                    if (keyEvent.getAction() == 0) {
                        if (keyEvent.getKeyCode() == 21) {
                            z = dVar.d(true, keyEvent.isShiftPressed());
                        } else if (keyEvent.getKeyCode() == 22) {
                            z = dVar.d(false, keyEvent.isShiftPressed());
                        } else if (keyEvent.getKeyCode() == 19) {
                            z = dVar.e(true, keyEvent.isShiftPressed());
                        } else if (keyEvent.getKeyCode() == 20) {
                            z = dVar.e(false, keyEvent.isShiftPressed());
                        } else {
                            if (keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160) {
                                EditorInfo editorInfo = dVar.f9181e;
                                if ((editorInfo.inputType & 131072) == 0) {
                                    dVar.performEditorAction(editorInfo.imeOptions & KotlinVersion.MAX_COMPONENT_VALUE);
                                    z = true;
                                }
                            }
                            g gVar = dVar.f9180d;
                            int selectionStart = Selection.getSelectionStart(gVar);
                            int selectionEnd = Selection.getSelectionEnd(gVar);
                            int unicodeChar = keyEvent.getUnicodeChar();
                            if (selectionStart >= 0 && selectionEnd >= 0 && unicodeChar != 0) {
                                int min = Math.min(selectionStart, selectionEnd);
                                int max = Math.max(selectionStart, selectionEnd);
                                dVar.beginBatchEdit();
                                if (min != max) {
                                    gVar.delete(min, max);
                                }
                                gVar.insert(min, (CharSequence) String.valueOf((char) unicodeChar));
                                int i3 = min + 1;
                                dVar.setSelection(i3, i3);
                                dVar.endBatchEdit();
                                z = true;
                            }
                        }
                    }
                } else {
                    z = inputConnection.sendKeyEvent(keyEvent);
                }
            }
            if (z) {
                return;
            }
            HashSet hashSet = (HashSet) this.f24c;
            hashSet.add(keyEvent);
            ((t) d3).getRootView().dispatchKeyEvent(keyEvent);
            if (hashSet.remove(keyEvent)) {
                Log.w("KeyboardManager", "A redispatched key event was consumed before reaching KeyboardManager");
            }
        }
    }

    public void M(Activity activity, g0.j jVar) {
        kotlin.jvm.internal.j.e(activity, "activity");
        ReentrantLock reentrantLock = (ReentrantLock) this.f24c;
        reentrantLock.lock();
        WeakHashMap weakHashMap = (WeakHashMap) this.f25d;
        try {
            if (jVar.equals((g0.j) weakHashMap.get(activity))) {
                return;
            }
            reentrantLock.unlock();
            Iterator it = ((j0.k) ((r) this.f23b).f2543a).f9514b.iterator();
            while (it.hasNext()) {
                j0.j jVar2 = (j0.j) it.next();
                if (jVar2.f9508a.equals(activity)) {
                    jVar2.f9510c = jVar;
                    jVar2.f9509b.accept(jVar);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public Boolean N(String str, Boolean bool, X1.e eVar, X1.a aVar) {
        ActivityOptions activityOptions;
        if (((AbstractActivityC0029e) this.f25d) == null) {
            throw new X1.b();
        }
        Bundle z = z(eVar.f1736c);
        if (bool.booleanValue()) {
            Iterator it = eVar.f1736c.keySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    String lowerCase = ((String) it.next()).toLowerCase(Locale.US);
                    lowerCase.getClass();
                    switch (lowerCase) {
                    }
                } else {
                    Uri parse = Uri.parse(str);
                    AbstractActivityC0029e abstractActivityC0029e = (AbstractActivityC0029e) this.f25d;
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", aVar.f1729a.booleanValue() ? 1 : 0);
                    if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
                        Bundle bundle = new Bundle();
                        bundle.putBinder("android.support.customtabs.extra.SESSION", null);
                        intent.putExtras(bundle);
                    }
                    intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
                    intent.putExtras(new Bundle());
                    intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
                    int i3 = Build.VERSION.SDK_INT;
                    LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
                    String languageTag = adjustedDefault.size() > 0 ? adjustedDefault.get(0).toLanguageTag() : null;
                    if (!TextUtils.isEmpty(languageTag)) {
                        Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
                        if (!bundleExtra.containsKey("Accept-Language")) {
                            bundleExtra.putString("Accept-Language", languageTag);
                            intent.putExtra("com.android.browser.headers", bundleExtra);
                        }
                    }
                    if (i3 >= 34) {
                        activityOptions = ActivityOptions.makeBasic();
                        AbstractC0014o.h(activityOptions);
                    } else {
                        activityOptions = null;
                    }
                    if (i3 >= 36) {
                        if (activityOptions == null) {
                            activityOptions = ActivityOptions.makeBasic();
                        }
                        F.d.e(activityOptions, !intent.getBooleanExtra("androidx.browser.customtabs.extra.DISABLE_BACKGROUND_INTERACTION", false));
                    }
                    Bundle bundle2 = activityOptions != null ? activityOptions.toBundle() : null;
                    intent.putExtra("com.android.browser.headers", z);
                    try {
                        intent.setData(parse);
                        abstractActivityC0029e.startActivity(intent, bundle2);
                        return Boolean.TRUE;
                    } catch (ActivityNotFoundException unused) {
                    }
                }
            }
        }
        AbstractActivityC0029e abstractActivityC0029e2 = (AbstractActivityC0029e) this.f25d;
        boolean booleanValue = eVar.f1734a.booleanValue();
        boolean booleanValue2 = eVar.f1735b.booleanValue();
        int i4 = WebViewActivity.f9332e;
        try {
            ((AbstractActivityC0029e) this.f25d).startActivity(new Intent(abstractActivityC0029e2, (Class<?>) WebViewActivity.class).putExtra("url", str).putExtra("enableJavaScript", booleanValue).putExtra("enableDomStorage", booleanValue2).putExtra("com.android.browser.headers", z));
            return Boolean.TRUE;
        } catch (ActivityNotFoundException unused2) {
            return Boolean.FALSE;
        }
    }

    public void O() {
        ((TypedArray) this.f24c).recycle();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        r4 = r3.f9994a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
    
        if (r4 >= r6.length) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        r6[r4] = r2;
        r3.f9994a = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
    
        r1 = r1 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void P(ArrayList arrayList) {
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            AbstractC0065a instance = (AbstractC0065a) arrayList.get(i3);
            instance.getClass();
            C1125E c1125e = (C1125E) this.f23b;
            c1125e.getClass();
            kotlin.jvm.internal.j.e(instance, "instance");
            int i4 = c1125e.f9994a;
            int i5 = 0;
            while (true) {
                Object[] objArr = (Object[]) c1125e.f9995b;
                if (i5 >= i4) {
                    break;
                } else {
                    if (objArr[i5] == instance) {
                        throw new IllegalStateException("Already in the pool!");
                    }
                    i5++;
                }
            }
        }
        arrayList.clear();
    }

    public void Q(C1184a c1184a) {
        M m3 = new M(25);
        i iVar = (i) this.f23b;
        C1185b c1185b = (C1185b) this.f24c;
        n nVar = (n) this.f25d;
        EnumC1186c enumC1186c = EnumC1186c.f10290a;
        f a3 = i.a();
        a3.R(iVar.f10554a);
        a3.f25d = enumC1186c;
        a3.f24c = iVar.f10555b;
        i t3 = a3.t();
        F1.c cVar = new F1.c();
        cVar.f = new HashMap();
        cVar.f489d = Long.valueOf(nVar.f10567a.d());
        cVar.f490e = Long.valueOf(nVar.f10568b.d());
        cVar.f486a = "PLAY_BILLING_LIBRARY";
        cVar.f488c = new v0.k(c1185b, c1184a.f10288a.b());
        cVar.f487b = null;
        h c3 = cVar.c();
        c cVar2 = (c) nVar.f10569c;
        cVar2.getClass();
        cVar2.f12b.execute(new a(cVar2, t3, m3, c3));
    }

    public void R(String str) {
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f23b = str;
    }

    public void S(V0.e eVar) {
        ((P1.f) this.f23b).b((String) this.f24c, eVar == null ? null : new f(this, eVar));
    }

    public Boolean U() {
        String str;
        List list = Collections.EMPTY_LIST;
        PackageManager packageManager = ((Context) this.f23b).getPackageManager();
        List arrayList = list == null ? new ArrayList() : list;
        ResolveInfo resolveActivity = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://")), 0);
        if (resolveActivity != null) {
            String str2 = resolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str2);
            if (list != null) {
                arrayList2.addAll(list);
            }
            arrayList = arrayList2;
        }
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                str = (String) it.next();
                intent.setPackage(str);
                if (packageManager.resolveService(intent, 0) != null) {
                    break;
                }
            } else {
                if (Build.VERSION.SDK_INT >= 30) {
                    Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
                }
                str = null;
            }
        }
        return Boolean.valueOf(str != null);
    }

    public void V() {
        synchronized (((HashMap) this.f23b)) {
            try {
                Iterator it = ((HashMap) this.f23b).values().iterator();
                while (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                }
                ((HashMap) this.f23b).clear();
            } finally {
            }
        }
        synchronized (((HashMap) this.f25d)) {
            try {
                Iterator it2 = ((HashMap) this.f25d).values().iterator();
                while (it2.hasNext()) {
                    if (it2.next() != null) {
                        throw new ClassCastException();
                    }
                }
                ((HashMap) this.f25d).clear();
            } finally {
            }
        }
        synchronized (((HashMap) this.f24c)) {
            try {
                Iterator it3 = ((HashMap) this.f24c).values().iterator();
                while (it3.hasNext()) {
                    if (it3.next() != null) {
                        throw new ClassCastException();
                    }
                }
                ((HashMap) this.f24c).clear();
            } finally {
            }
        }
    }

    @Override // W1.InterfaceC0095g
    public void a(String str, long j3, C0096h c0096h) {
        v(c0096h).edit().putLong(str, j3).apply();
    }

    @Override // W1.InterfaceC0095g
    public void b(List list, C0096h c0096h) {
        SharedPreferences v = v(c0096h);
        SharedPreferences.Editor edit = v.edit();
        kotlin.jvm.internal.j.d(edit, "edit(...)");
        Map<String, ?> all = v.getAll();
        kotlin.jvm.internal.j.d(all, "getAll(...)");
        ArrayList arrayList = new ArrayList();
        for (String str : all.keySet()) {
            if (L.b(str, all.get(str), list != null ? c2.e.a0(list) : null)) {
                arrayList.add(str);
            }
        }
        Iterator it = arrayList.iterator();
        kotlin.jvm.internal.j.d(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            kotlin.jvm.internal.j.d(next, "next(...)");
            edit.remove((String) next);
        }
        edit.apply();
    }

    @Override // W1.InterfaceC0095g
    public O c(String str, C0096h c0096h) {
        SharedPreferences v = v(c0096h);
        if (!v.contains(str)) {
            return null;
        }
        String string = v.getString(str, "");
        kotlin.jvm.internal.j.b(string);
        return s2.n.X(string, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!") ? new O(string, W1.M.JSON_ENCODED) : s2.n.X(string, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") ? new O(null, W1.M.PLATFORM_ENCODED) : new O(null, W1.M.UNEXPECTED_STRING);
    }

    @Override // P1.d
    public void d(ByteBuffer byteBuffer, G1.g gVar) {
        f fVar = (f) this.f25d;
        String str = ((u) fVar.f25d).e(byteBuffer).f1266a;
        boolean equals = str.equals("listen");
        AtomicReference atomicReference = (AtomicReference) this.f24c;
        String str2 = (String) fVar.f24c;
        u uVar = (u) fVar.f25d;
        V0.e eVar = (V0.e) this.f23b;
        if (!equals) {
            if (!str.equals("cancel")) {
                gVar.a(null);
                return;
            }
            if (((P1.g) atomicReference.getAndSet(null)) == null) {
                gVar.a(uVar.d("error", "No active stream to cancel", null));
                return;
            }
            try {
                eVar.f1600c = null;
                gVar.a(uVar.b(null));
                return;
            } catch (RuntimeException e3) {
                Log.e("EventChannel#" + str2, "Failed to close event stream", e3);
                gVar.a(uVar.d("error", e3.getMessage(), null));
                return;
            }
        }
        P1.g gVar2 = new P1.g(this);
        if (((P1.g) atomicReference.getAndSet(gVar2)) != null) {
            try {
                eVar.f1600c = null;
            } catch (RuntimeException e4) {
                Log.e("EventChannel#" + str2, "Failed to close existing event stream", e4);
            }
        }
        try {
            eVar.f1600c = gVar2;
            gVar.a(uVar.b(null));
        } catch (RuntimeException e5) {
            atomicReference.set(null);
            Log.e("EventChannel#" + str2, "Failed to open event stream", e5);
            gVar.a(uVar.d("error", e5.getMessage(), null));
        }
    }

    @Override // W1.InterfaceC0095g
    public void e(String str, List list, C0096h c0096h) {
        v(c0096h).edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu".concat(((C0080a) this.f25d).e(list))).apply();
    }

    @Override // W1.InterfaceC0095g
    public Map f(List list, C0096h c0096h) {
        Object value;
        Map<String, ?> all = v(c0096h).getAll();
        kotlin.jvm.internal.j.d(all, "getAll(...)");
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            if (L.b(entry.getKey(), entry.getValue(), list != null ? c2.e.a0(list) : null) && (value = entry.getValue()) != null) {
                String key = entry.getKey();
                Object c3 = L.c(value, (C0080a) this.f25d);
                kotlin.jvm.internal.j.c(c3, "null cannot be cast to non-null type kotlin.Any");
                hashMap.put(key, c3);
            }
        }
        return hashMap;
    }

    @Override // W1.InterfaceC0095g
    public ArrayList g(String str, C0096h c0096h) {
        List list;
        SharedPreferences v = v(c0096h);
        if (!v.contains(str)) {
            return null;
        }
        String string = v.getString(str, "");
        kotlin.jvm.internal.j.b(string);
        if (!s2.n.X(string, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") || s2.n.X(string, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!") || (list = (List) L.c(v.getString(str, ""), (C0080a) this.f25d)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof String) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // a2.InterfaceC0133a
    public Object get() {
        switch (this.f22a) {
            case 0:
                return new B0.d((Context) ((r) this.f23b).f2543a, (C0.d) ((InterfaceC0133a) this.f24c).get(), (B0.b) ((j) this.f25d).get());
            default:
                return new n(new j(4), new j(3), (e) ((d) this.f23b).get(), (m) ((t0) this.f24c).get(), (o) ((p) this.f25d).get());
        }
    }

    @Override // W1.InterfaceC0095g
    public void h(String str, double d3, C0096h c0096h) {
        v(c0096h).edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d3).apply();
    }

    @Override // W1.InterfaceC0095g
    public void j(String str, String str2, C0096h c0096h) {
        v(c0096h).edit().putString(str, str2).apply();
    }

    @Override // W1.InterfaceC0095g
    public String k(String str, C0096h c0096h) {
        SharedPreferences v = v(c0096h);
        if (v.contains(str)) {
            return v.getString(str, "");
        }
        return null;
    }

    @Override // W1.InterfaceC0095g
    public Boolean l(String str, C0096h c0096h) {
        SharedPreferences v = v(c0096h);
        if (v.contains(str)) {
            return Boolean.valueOf(v.getBoolean(str, true));
        }
        return null;
    }

    @Override // W1.InterfaceC0095g
    public void m(String str, boolean z, C0096h c0096h) {
        v(c0096h).edit().putBoolean(str, z).apply();
    }

    @Override // w2.d
    public Object n(w2.e eVar, InterfaceC0300c interfaceC0300c) {
        Object n3 = ((w2.d) this.f23b).n(new W1.r(eVar, (N.d) this.f24c, (K) this.f25d), interfaceC0300c);
        return n3 == EnumC0317a.f4969a ? n3 : C0195i.f2555a;
    }

    @Override // W1.InterfaceC0095g
    public Double o(String str, C0096h c0096h) {
        SharedPreferences v = v(c0096h);
        if (!v.contains(str)) {
            return null;
        }
        Object c3 = L.c(v.getString(str, ""), (C0080a) this.f25d);
        kotlin.jvm.internal.j.c(c3, "null cannot be cast to non-null type kotlin.Double");
        return (Double) c3;
    }

    @Override // W1.InterfaceC0095g
    public void p(String str, String str2, C0096h c0096h) {
        v(c0096h).edit().putString(str, str2).apply();
    }

    @Override // W1.InterfaceC0095g
    public Long q(String str, C0096h c0096h) {
        long j3;
        SharedPreferences v = v(c0096h);
        if (!v.contains(str)) {
            return null;
        }
        try {
            j3 = v.getLong(str, 0L);
        } catch (ClassCastException unused) {
            j3 = v.getInt(str, 0);
        }
        return Long.valueOf(j3);
    }

    @Override // W1.InterfaceC0095g
    public List r(List list, C0096h c0096h) {
        Map<String, ?> all = v(c0096h).getAll();
        kotlin.jvm.internal.j.d(all, "getAll(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            kotlin.jvm.internal.j.d(key, "<get-key>(...)");
            if (L.b(key, entry.getValue(), list != null ? c2.e.a0(list) : null)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return c2.e.Y(linkedHashMap.keySet());
    }

    public void s() {
        AbstractAsyncTaskC1190a abstractAsyncTaskC1190a = (AbstractAsyncTaskC1190a) ((ArrayDeque) this.f24c).poll();
        this.f25d = abstractAsyncTaskC1190a;
        if (abstractAsyncTaskC1190a != null) {
            abstractAsyncTaskC1190a.executeOnExecutor((ThreadPoolExecutor) this.f23b, new Object[0]);
        }
    }

    public i t() {
        String str = ((String) this.f23b) == null ? " backendName" : "";
        if (((EnumC1186c) this.f25d) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new i((String) this.f23b, (byte[]) this.f24c, (EnumC1186c) this.f25d);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public String toString() {
        switch (this.f22a) {
            case 9:
                return ((C0066b) this.f24c).toString() + ", hidden list:" + ((ArrayList) this.f25d).size();
            case 15:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.f23b);
                sb.append('{');
                C0229i c0229i = ((C0229i) this.f24c).f2873b;
                String str = "";
                while (c0229i != null) {
                    Object obj = c0229i.f2872a;
                    sb.append(str);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r2.length() - 1);
                    }
                    c0229i = c0229i.f2873b;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public Boolean u(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        ComponentName resolveActivity = intent.resolveActivity(((Context) ((B0.g) this.f24c).f131b).getPackageManager());
        return (resolveActivity == null ? null : resolveActivity.toShortString()) == null ? Boolean.FALSE : Boolean.valueOf(!"{com.android.fallback/com.android.fallback.Fallback}".equals(r3));
    }

    public SharedPreferences v(C0096h c0096h) {
        String str = c0096h.f1673a;
        Context context = (Context) this.f24c;
        if (str != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            kotlin.jvm.internal.j.b(sharedPreferences);
            return sharedPreferences;
        }
        SharedPreferences sharedPreferences2 = context.getSharedPreferences(context.getPackageName() + "_preferences", 0);
        kotlin.jvm.internal.j.b(sharedPreferences2);
        return sharedPreferences2;
    }

    public void w(int i3, io.flutter.view.f fVar) {
        ((FlutterJNI) this.f24c).dispatchSemanticsAction(i3, fVar);
    }

    public void x(int i3, io.flutter.view.f fVar, Serializable serializable) {
        ((FlutterJNI) this.f24c).dispatchSemanticsAction(i3, fVar, serializable);
    }

    public void y(C1251a c1251a, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap hashMap = (HashMap) this.f24c;
        HashMap hashMap2 = (HashMap) this.f23b;
        h1.e eVar = new h1.e(byteArrayOutputStream, hashMap2, hashMap, (C0332a) this.f25d);
        InterfaceC0313d interfaceC0313d = (InterfaceC0313d) hashMap2.get(C1251a.class);
        if (interfaceC0313d != null) {
            interfaceC0313d.a(c1251a, eVar);
        } else {
            throw new C0311b("No encoder for " + C1251a.class);
        }
    }

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, int i3) {
        this.f22a = i3;
        this.f23b = obj;
        this.f24c = obj2;
        this.f25d = obj3;
    }

    public f(C0080a c0080a) {
        this.f22a = 13;
        this.f23b = new HashMap();
        this.f24c = new HashMap();
        this.f25d = new HashMap();
    }

    public f(String str) {
        this.f22a = 15;
        C0229i c0229i = new C0229i();
        this.f24c = c0229i;
        this.f25d = c0229i;
        this.f23b = str;
    }

    public f(i iVar, C1185b c1185b, m1.c cVar, n nVar) {
        this.f22a = 25;
        this.f23b = iVar;
        this.f24c = c1185b;
        this.f25d = nVar;
    }

    public f(F store, E e3, Q.b defaultCreationExtras) {
        this.f22a = 14;
        kotlin.jvm.internal.j.e(store, "store");
        kotlin.jvm.internal.j.e(defaultCreationExtras, "defaultCreationExtras");
        this.f23b = store;
        this.f24c = e3;
        this.f25d = defaultCreationExtras;
    }

    public f(C0.e eVar) {
        this.f22a = 9;
        this.f23b = eVar;
        this.f24c = new C0066b();
        this.f25d = new ArrayList();
    }

    public f(P1.f fVar, String str) {
        this.f22a = 7;
        u uVar = u.f1272b;
        this.f23b = fVar;
        this.f24c = str;
        this.f25d = uVar;
    }

    public f(Context context) {
        this.f22a = 12;
        B0.g gVar = new B0.g(15, context);
        this.f23b = context;
        this.f24c = gVar;
    }

    public f(Context context, TypedArray typedArray) {
        this.f22a = 19;
        this.f23b = context;
        this.f24c = typedArray;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0286  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f(t.d dVar) {
        Bundle bundle;
        int i3;
        ArrayList arrayList;
        Iterator it;
        char c3;
        Icon icon;
        Bundle bundle2;
        Bundle bundle3;
        String str;
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        int i4;
        this.f22a = 20;
        new ArrayList();
        this.f25d = new Bundle();
        this.f24c = dVar;
        Context context = dVar.f10340a;
        int i5 = 26;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f23b = AbstractC0005f.a(context, dVar.f10351m);
        } else {
            this.f23b = new Notification.Builder(dVar.f10340a);
        }
        Notification notification = dVar.o;
        char c4 = 2;
        ((Notification.Builder) this.f23b).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(dVar.f10344e).setContentText(dVar.f).setContentInfo(null).setContentIntent(dVar.f10345g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(0).setProgress(0, 0, false);
        ((Notification.Builder) this.f23b).setLargeIcon((Icon) null);
        ((Notification.Builder) this.f23b).setSubText(null).setUsesChronometer(false).setPriority(dVar.f10346h);
        Iterator it2 = dVar.f10341b.iterator();
        while (it2.hasNext()) {
            t.c cVar = (t.c) it2.next();
            int i6 = Build.VERSION.SDK_INT;
            if (cVar.f10335b == null && (i4 = cVar.f10338e) != 0) {
                cVar.f10335b = IconCompat.a(i4);
            }
            IconCompat iconCompat = cVar.f10335b;
            if (iconCompat != null) {
                int i7 = iconCompat.f2174a;
                switch (i7) {
                    case -1:
                        it = it2;
                        c3 = c4;
                        icon = (Icon) iconCompat.f2175b;
                        break;
                    case 0:
                    default:
                        throw new IllegalArgumentException("Unknown type");
                    case 1:
                        it = it2;
                        c3 = c4;
                        icon = Icon.createWithBitmap((Bitmap) iconCompat.f2175b);
                        colorStateList = iconCompat.f2179g;
                        if (colorStateList != null) {
                            icon.setTintList(colorStateList);
                        }
                        mode = iconCompat.f2180h;
                        if (mode != IconCompat.f2173k) {
                            icon.setTintMode(mode);
                            break;
                        }
                        break;
                    case 2:
                        it = it2;
                        if (i7 == -1) {
                            Object obj = iconCompat.f2175b;
                            if (i6 >= 28) {
                                str = AbstractC0003d.e(obj);
                            } else {
                                try {
                                    str = (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
                                } catch (IllegalAccessException e3) {
                                    Log.e("IconCompat", "Unable to get icon package", e3);
                                    str = null;
                                    c3 = 2;
                                    icon = Icon.createWithResource(str, iconCompat.f2178e);
                                    colorStateList = iconCompat.f2179g;
                                    if (colorStateList != null) {
                                    }
                                    mode = iconCompat.f2180h;
                                    if (mode != IconCompat.f2173k) {
                                    }
                                    Notification.Action.Builder builder = new Notification.Action.Builder(icon, cVar.f, cVar.f10339g);
                                    bundle2 = cVar.f10334a;
                                    if (bundle2 == null) {
                                    }
                                    boolean z = cVar.f10336c;
                                    bundle3.putBoolean("android.support.allowGeneratedReplies", z);
                                    builder.setAllowGeneratedReplies(z);
                                    bundle3.putInt("android.support.action.semanticAction", 0);
                                    if (i6 >= 28) {
                                    }
                                    if (i6 >= 29) {
                                    }
                                    if (i6 < 31) {
                                    }
                                    bundle3.putBoolean("android.support.action.showsUserInterface", cVar.f10337d);
                                    builder.addExtras(bundle3);
                                    ((Notification.Builder) this.f23b).addAction(builder.build());
                                    c4 = c3;
                                    it2 = it;
                                    i5 = 26;
                                } catch (NoSuchMethodException e4) {
                                    Log.e("IconCompat", "Unable to get icon package", e4);
                                    str = null;
                                    c3 = 2;
                                    icon = Icon.createWithResource(str, iconCompat.f2178e);
                                    colorStateList = iconCompat.f2179g;
                                    if (colorStateList != null) {
                                    }
                                    mode = iconCompat.f2180h;
                                    if (mode != IconCompat.f2173k) {
                                    }
                                    Notification.Action.Builder builder2 = new Notification.Action.Builder(icon, cVar.f, cVar.f10339g);
                                    bundle2 = cVar.f10334a;
                                    if (bundle2 == null) {
                                    }
                                    boolean z2 = cVar.f10336c;
                                    bundle3.putBoolean("android.support.allowGeneratedReplies", z2);
                                    builder2.setAllowGeneratedReplies(z2);
                                    bundle3.putInt("android.support.action.semanticAction", 0);
                                    if (i6 >= 28) {
                                    }
                                    if (i6 >= 29) {
                                    }
                                    if (i6 < 31) {
                                    }
                                    bundle3.putBoolean("android.support.action.showsUserInterface", cVar.f10337d);
                                    builder2.addExtras(bundle3);
                                    ((Notification.Builder) this.f23b).addAction(builder2.build());
                                    c4 = c3;
                                    it2 = it;
                                    i5 = 26;
                                } catch (InvocationTargetException e5) {
                                    Log.e("IconCompat", "Unable to get icon package", e5);
                                    str = null;
                                    c3 = 2;
                                    icon = Icon.createWithResource(str, iconCompat.f2178e);
                                    colorStateList = iconCompat.f2179g;
                                    if (colorStateList != null) {
                                    }
                                    mode = iconCompat.f2180h;
                                    if (mode != IconCompat.f2173k) {
                                    }
                                    Notification.Action.Builder builder22 = new Notification.Action.Builder(icon, cVar.f, cVar.f10339g);
                                    bundle2 = cVar.f10334a;
                                    if (bundle2 == null) {
                                    }
                                    boolean z22 = cVar.f10336c;
                                    bundle3.putBoolean("android.support.allowGeneratedReplies", z22);
                                    builder22.setAllowGeneratedReplies(z22);
                                    bundle3.putInt("android.support.action.semanticAction", 0);
                                    if (i6 >= 28) {
                                    }
                                    if (i6 >= 29) {
                                    }
                                    if (i6 < 31) {
                                    }
                                    bundle3.putBoolean("android.support.action.showsUserInterface", cVar.f10337d);
                                    builder22.addExtras(bundle3);
                                    ((Notification.Builder) this.f23b).addAction(builder22.build());
                                    c4 = c3;
                                    it2 = it;
                                    i5 = 26;
                                }
                            }
                            c3 = 2;
                        } else {
                            c3 = 2;
                            if (i7 == 2) {
                                String str2 = iconCompat.f2182j;
                                if (str2 != null && !TextUtils.isEmpty(str2)) {
                                    str = iconCompat.f2182j;
                                } else {
                                    str = ((String) iconCompat.f2175b).split(StringUtils.PROCESS_POSTFIX_DELIMITER, -1)[0];
                                }
                            } else {
                                throw new IllegalStateException("called getResPackage() on " + iconCompat);
                            }
                        }
                        icon = Icon.createWithResource(str, iconCompat.f2178e);
                        colorStateList = iconCompat.f2179g;
                        if (colorStateList != null) {
                        }
                        mode = iconCompat.f2180h;
                        if (mode != IconCompat.f2173k) {
                        }
                        break;
                    case 3:
                        it = it2;
                        icon = Icon.createWithData((byte[]) iconCompat.f2175b, iconCompat.f2178e, iconCompat.f);
                        c3 = 2;
                        colorStateList = iconCompat.f2179g;
                        if (colorStateList != null) {
                        }
                        mode = iconCompat.f2180h;
                        if (mode != IconCompat.f2173k) {
                        }
                        break;
                    case 4:
                        it = it2;
                        icon = Icon.createWithContentUri((String) iconCompat.f2175b);
                        c3 = 2;
                        colorStateList = iconCompat.f2179g;
                        if (colorStateList != null) {
                        }
                        mode = iconCompat.f2180h;
                        if (mode != IconCompat.f2173k) {
                        }
                        break;
                    case 5:
                        if (i6 >= i5) {
                            icon = AbstractC0005f.b((Bitmap) iconCompat.f2175b);
                            it = it2;
                            c3 = c4;
                            colorStateList = iconCompat.f2179g;
                            if (colorStateList != null) {
                            }
                            mode = iconCompat.f2180h;
                            if (mode != IconCompat.f2173k) {
                            }
                        } else {
                            Bitmap bitmap = (Bitmap) iconCompat.f2175b;
                            int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
                            Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(createBitmap);
                            Paint paint = new Paint(3);
                            float f = min * 0.5f;
                            paint.setColor(-16777216);
                            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                            Matrix matrix = new Matrix();
                            it = it2;
                            matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
                            bitmapShader.setLocalMatrix(matrix);
                            paint.setShader(bitmapShader);
                            canvas.drawCircle(f, f, f * 0.9166667f, paint);
                            canvas.setBitmap(null);
                            icon = Icon.createWithBitmap(createBitmap);
                            c3 = 2;
                            colorStateList = iconCompat.f2179g;
                            if (colorStateList != null) {
                            }
                            mode = iconCompat.f2180h;
                            if (mode != IconCompat.f2173k) {
                            }
                        }
                        break;
                    case 6:
                        if (i6 >= 30) {
                            icon = E.C.a(iconCompat.c());
                            it = it2;
                            c3 = c4;
                            colorStateList = iconCompat.f2179g;
                            if (colorStateList != null) {
                            }
                            mode = iconCompat.f2180h;
                            if (mode != IconCompat.f2173k) {
                            }
                        } else {
                            throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.c());
                        }
                        break;
                }
            } else {
                it = it2;
                c3 = c4;
                icon = null;
            }
            Notification.Action.Builder builder222 = new Notification.Action.Builder(icon, cVar.f, cVar.f10339g);
            bundle2 = cVar.f10334a;
            if (bundle2 == null) {
                bundle3 = new Bundle(bundle2);
            } else {
                bundle3 = new Bundle();
            }
            boolean z222 = cVar.f10336c;
            bundle3.putBoolean("android.support.allowGeneratedReplies", z222);
            builder222.setAllowGeneratedReplies(z222);
            bundle3.putInt("android.support.action.semanticAction", 0);
            if (i6 >= 28) {
                AbstractC0003d.o(builder222);
            }
            if (i6 >= 29) {
                t.e.d(builder222);
            }
            if (i6 < 31) {
                t.f.a(builder222);
            }
            bundle3.putBoolean("android.support.action.showsUserInterface", cVar.f10337d);
            builder222.addExtras(bundle3);
            ((Notification.Builder) this.f23b).addAction(builder222.build());
            c4 = c3;
            it2 = it;
            i5 = 26;
        }
        Bundle bundle4 = dVar.f10350l;
        if (bundle4 != null) {
            ((Bundle) this.f25d).putAll(bundle4);
        }
        int i8 = Build.VERSION.SDK_INT;
        ((Notification.Builder) this.f23b).setShowWhen(dVar.f10347i);
        ((Notification.Builder) this.f23b).setLocalOnly(dVar.f10349k);
        ((Notification.Builder) this.f23b).setGroup(null);
        ((Notification.Builder) this.f23b).setSortKey(null);
        ((Notification.Builder) this.f23b).setGroupSummary(false);
        ((Notification.Builder) this.f23b).setCategory(null);
        ((Notification.Builder) this.f23b).setColor(0);
        ((Notification.Builder) this.f23b).setVisibility(0);
        ((Notification.Builder) this.f23b).setPublicVersion(null);
        ((Notification.Builder) this.f23b).setSound(notification.sound, notification.audioAttributes);
        ArrayList arrayList2 = dVar.f10353p;
        ArrayList arrayList3 = dVar.f10342c;
        if (i8 < 28) {
            if (arrayList3 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList3.size());
                Iterator it3 = arrayList3.iterator();
                if (it3.hasNext()) {
                    it3.next().getClass();
                    throw new ClassCastException();
                }
            }
            if (arrayList != null) {
                if (arrayList2 == null) {
                    arrayList2 = arrayList;
                } else {
                    C1170f c1170f = new C1170f(arrayList2.size() + arrayList.size());
                    c1170f.addAll(arrayList);
                    c1170f.addAll(arrayList2);
                    arrayList2 = new ArrayList(c1170f);
                }
            }
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                ((Notification.Builder) this.f23b).addPerson((String) it4.next());
            }
        }
        ArrayList arrayList4 = dVar.f10343d;
        if (arrayList4.size() > 0) {
            if (dVar.f10350l == null) {
                dVar.f10350l = new Bundle();
            }
            Bundle bundle5 = dVar.f10350l.getBundle("android.car.EXTENSIONS");
            bundle5 = bundle5 == null ? new Bundle() : bundle5;
            Bundle bundle6 = new Bundle(bundle5);
            Bundle bundle7 = new Bundle();
            for (int i9 = 0; i9 < arrayList4.size(); i9++) {
                String num = Integer.toString(i9);
                t.c cVar2 = (t.c) arrayList4.get(i9);
                Bundle bundle8 = new Bundle();
                if (cVar2.f10335b == null && (i3 = cVar2.f10338e) != 0) {
                    cVar2.f10335b = IconCompat.a(i3);
                }
                IconCompat iconCompat2 = cVar2.f10335b;
                bundle8.putInt("icon", iconCompat2 != null ? iconCompat2.b() : 0);
                bundle8.putCharSequence("title", cVar2.f);
                bundle8.putParcelable("actionIntent", cVar2.f10339g);
                Bundle bundle9 = cVar2.f10334a;
                if (bundle9 != null) {
                    bundle = new Bundle(bundle9);
                } else {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android.support.allowGeneratedReplies", cVar2.f10336c);
                bundle8.putBundle("extras", bundle);
                bundle8.putParcelableArray("remoteInputs", null);
                bundle8.putBoolean("showsUserInterface", cVar2.f10337d);
                bundle8.putInt("semanticAction", 0);
                bundle7.putBundle(num, bundle8);
            }
            bundle5.putBundle("invisible_actions", bundle7);
            bundle6.putBundle("invisible_actions", bundle7);
            if (dVar.f10350l == null) {
                dVar.f10350l = new Bundle();
            }
            dVar.f10350l.putBundle("android.car.EXTENSIONS", bundle5);
            ((Bundle) this.f25d).putBundle("android.car.EXTENSIONS", bundle6);
        }
        int i10 = Build.VERSION.SDK_INT;
        ((Notification.Builder) this.f23b).setExtras(dVar.f10350l);
        ((Notification.Builder) this.f23b).setRemoteInputHistory(null);
        if (i10 >= 26) {
            AbstractC0005f.i((Notification.Builder) this.f23b);
            AbstractC0005f.o((Notification.Builder) this.f23b);
            AbstractC0005f.p((Notification.Builder) this.f23b);
            AbstractC0005f.q((Notification.Builder) this.f23b);
            AbstractC0005f.k((Notification.Builder) this.f23b);
            if (!TextUtils.isEmpty(dVar.f10351m)) {
                ((Notification.Builder) this.f23b).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i10 >= 28) {
            Iterator it5 = arrayList3.iterator();
            if (it5.hasNext()) {
                it5.next().getClass();
                throw new ClassCastException();
            }
        }
        if (i10 >= 29) {
            t.e.b((Notification.Builder) this.f23b, dVar.f10352n);
            t.e.c((Notification.Builder) this.f23b);
        }
        if (i10 >= 36) {
            F.d.f((Notification.Builder) this.f23b);
        }
    }

    public f(j jVar) {
        this.f22a = 8;
        this.f23b = new C1125E(30);
        this.f24c = new ArrayList();
        this.f25d = new ArrayList();
        new j(25, this);
    }

    public f(G1.b bVar, FlutterJNI flutterJNI) {
        this.f22a = 4;
        C0178i c0178i = new C0178i(10, this);
        p pVar = new p((P1.f) bVar, "flutter/accessibility", (k) P1.t.INSTANCE, (j) null);
        this.f23b = pVar;
        pVar.i(c0178i);
        this.f24c = flutterJNI;
    }

    public f(D d3) {
        this.f22a = 2;
        this.f24c = new HashSet();
        this.f25d = d3;
        t tVar = (t) d3;
        this.f23b = new C[]{new z(tVar.getBinaryMessenger()), new V0.e(new C0.e(tVar.getBinaryMessenger()))};
        new C0178i(tVar.getBinaryMessenger()).f2532b = this;
    }

    public f(int i3) {
        this.f22a = i3;
        switch (i3) {
            case 22:
                this.f24c = new ArrayDeque();
                this.f25d = null;
                this.f23b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                break;
            default:
                this.f23b = new ConcurrentLinkedQueue();
                break;
        }
    }

    public f(f fVar, V0.e eVar) {
        this.f22a = 6;
        this.f25d = fVar;
        this.f24c = new AtomicReference(null);
        this.f23b = eVar;
    }

    public f(P1.f messenger, Context context, C0080a c0080a) {
        this.f22a = 10;
        kotlin.jvm.internal.j.e(messenger, "messenger");
        kotlin.jvm.internal.j.e(context, "context");
        this.f23b = messenger;
        this.f24c = context;
        this.f25d = c0080a;
        try {
            InterfaceC0095g.f1672u0.getClass();
            C0094f.b(messenger, this, "shared_preferences");
        } catch (Exception e3) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesBackend", e3);
        }
    }

    public f(r rVar) {
        this.f22a = 18;
        this.f23b = rVar;
        this.f24c = new ReentrantLock();
        this.f25d = new WeakHashMap();
    }
}
