package com.chartboost.sdk.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import android.view.View;
import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.events.ChartboostError;
import com.chartboost.sdk.impl.bk;
import com.chartboost.sdk.impl.c;
import com.chartboost.sdk.impl.hc;
import com.chartboost.sdk.impl.ml;
import com.chartboost.sdk.impl.o5;
import com.ironsource.C4701ic;
import com.ironsource.X3;
import com.pubmatic.sdk.video.POBVastError;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt;

/* loaded from: classes14.dex */
public final class pj extends m2 implements zf {
    public static final a A = new a(null);
    public final Context n;
    public final String o;
    public final di p;
    public final dl q;
    public final sd r;
    public final tl s;
    public final he t;
    public final y2 u;
    public final boolean v;
    public od w;
    public mk x;
    public Set y;
    public final d z;

    public static final class b extends ContinuationImpl {
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public Object f;
        public Object g;
        public Object h;
        public Object i;
        public Object j;
        public Object k;
        public Object l;
        public Object m;
        public /* synthetic */ Object n;
        public int p;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.n = obj;
            this.p |= Integer.MIN_VALUE;
            return pj.this.a(null, null, this);
        }
    }

    public static final class c extends Lambda implements Function1 {
        public static final c b = new c();

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(fc mf) {
            Intrinsics.checkNotNullParameter(mf, "mf");
            String c = mf.c();
            if (c == null) {
                c = "unknown";
            }
            Integer f = mf.f();
            Integer b2 = mf.b();
            Integer a = mf.a();
            return c + " " + f + VastAttributes.HORIZONTAL_POSITION + b2 + " " + (a != null ? a.intValue() : 0) + "kbps";
        }
    }

    public static final class e extends ContinuationImpl {
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public Object f;
        public /* synthetic */ Object g;
        public int i;

        public e(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.g = obj;
            this.i |= Integer.MIN_VALUE;
            Object a = pj.this.a((Context) null, this);
            return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Result.m8022boximpl(a);
        }
    }

    public static final class f extends Lambda implements Function1 {
        public static final f b = new f();

        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(m2 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            String simpleName = it.getClass().getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
            return simpleName;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pj(Context context, String xml, wf renderableConfig, a0 adMarkupConfig, di trackerComponent, rh telemetryManager, dl viewabilityComponent, sd okHttpNetworkClient, u adFormat, tl webViewFactory, Mediation mediation, he openMeasurementManager, y2 cbIdentity, boolean z) {
        super(renderableConfig, adMarkupConfig, trackerComponent, telemetryManager, adFormat, mediation);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(xml, "xml");
        Intrinsics.checkNotNullParameter(renderableConfig, "renderableConfig");
        Intrinsics.checkNotNullParameter(adMarkupConfig, "adMarkupConfig");
        Intrinsics.checkNotNullParameter(trackerComponent, "trackerComponent");
        Intrinsics.checkNotNullParameter(telemetryManager, "telemetryManager");
        Intrinsics.checkNotNullParameter(viewabilityComponent, "viewabilityComponent");
        Intrinsics.checkNotNullParameter(okHttpNetworkClient, "okHttpNetworkClient");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(webViewFactory, "webViewFactory");
        Intrinsics.checkNotNullParameter(openMeasurementManager, "openMeasurementManager");
        Intrinsics.checkNotNullParameter(cbIdentity, "cbIdentity");
        this.n = context;
        this.o = xml;
        this.p = trackerComponent;
        this.q = viewabilityComponent;
        this.r = okHttpNetworkClient;
        this.s = webViewFactory;
        this.t = openMeasurementManager;
        this.u = cbIdentity;
        this.v = z;
        this.y = new LinkedHashSet();
        this.z = new d();
    }

    @Override // com.chartboost.sdk.impl.zf
    public void b(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        zf j = j();
        if (j != null) {
            j.b(error);
        }
    }

    public final Integer c(Throwable th) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (th != null && linkedHashSet.add(th)) {
            if (th instanceof rj) {
                return ((rj) th).a();
            }
            th = th.getCause();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x05c1, code lost:
    
        if (r0 == null) goto L150;
     */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0278 A[LOOP:0: B:16:0x0272->B:18:0x0278, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, qj qjVar, Continuation continuation) {
        b bVar;
        int i;
        List arrayList;
        List arrayList2;
        List arrayList3;
        y4 a2;
        Triple triple;
        fc a3;
        String d2;
        pj pjVar;
        URL url;
        Context context2;
        List list;
        Set set;
        qj qjVar2;
        wa a4;
        List<o5> b2;
        mk mkVar;
        Collection emptyList;
        boolean z;
        String str;
        URL url2;
        vf vfVar;
        String str2;
        List b3;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i2 = bVar.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.p = i2 - Integer.MIN_VALUE;
                Object obj = bVar.n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = bVar.p;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    arrayList = new ArrayList();
                    arrayList2 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    arrayList3 = new ArrayList();
                    wj wjVar = new wj(cc.a(context, this.t, this.u, null, 8, null));
                    ml.b bVar2 = ml.e;
                    Set b4 = bVar2.b(qjVar.b(), wjVar);
                    List a5 = bVar2.a(qjVar.b(), wjVar);
                    Iterator it = qjVar.a().iterator();
                    while (it.hasNext()) {
                        com.chartboost.sdk.impl.c cVar = (com.chartboost.sdk.impl.c) it.next();
                        c.a aVar = cVar instanceof c.a ? (c.a) cVar : null;
                        if (aVar != null && (a4 = aVar.a()) != null && (b2 = a4.b()) != null) {
                            for (o5 o5Var : b2) {
                                if (o5Var instanceof o5.a) {
                                    arrayList4.addAll(((o5.a) o5Var).a().a());
                                } else if (o5Var instanceof o5.b) {
                                    o5.b bVar3 = (o5.b) o5Var;
                                    for (fc fcVar : bVar3.a().a()) {
                                        arrayList2.add(new fc(fcVar.c(), fcVar.f(), fcVar.b(), fcVar.a(), fcVar.d(), null, 32, null));
                                        arrayList3.add(bVar3.a().c());
                                        it = it;
                                    }
                                }
                            }
                            Iterator it2 = it;
                            Unit unit = Unit.INSTANCE;
                            it = it2;
                        }
                    }
                    DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                    cg cgVar = new cg(displayMetrics.widthPixels, displayMetrics.heightPixels, displayMetrics.density, null, null, 24, null);
                    nj o = w().o();
                    a2 = (o == null || !o.e()) ? null : a5.a.a(arrayList4, cgVar);
                    hc a6 = ic.a.a(arrayList2, cgVar);
                    if (a6 instanceof hc.b) {
                        a3 = ((hc.b) a6).a();
                        d2 = a3.d();
                        try {
                            URL url3 = new URL(a3.d());
                            bVar.b = this;
                            bVar.c = context;
                            bVar.d = qjVar;
                            bVar.e = arrayList;
                            bVar.f = arrayList2;
                            bVar.g = arrayList3;
                            bVar.h = b4;
                            bVar.i = a5;
                            bVar.j = a2;
                            bVar.k = a3;
                            bVar.l = d2;
                            bVar.m = url3;
                            bVar.p = 1;
                            Object c2 = kc.c(url3, bVar);
                            if (c2 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            pjVar = this;
                            url = url3;
                            obj = c2;
                            context2 = context;
                            list = a5;
                            set = b4;
                            qjVar2 = qjVar;
                        } catch (MalformedURLException e2) {
                            String d3 = a3.d();
                            String str3 = "Invalid video URL format: " + e2.getMessage();
                            uj ujVar = new uj("Unable to find Linear/MediaFile from URI: " + a3.d(), 401);
                            ujVar.initCause(e2);
                            Unit unit2 = Unit.INSTANCE;
                            throw new ChartboostError.Load.InvalidAssetUrl(d3, str3, ujVar);
                        }
                    } else {
                        if (!(a6 instanceof hc.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        String joinToString$default = CollectionsKt.joinToString$default(arrayList2, "; ", null, null, 0, null, c.b, 30, null);
                        hc.a aVar2 = (hc.a) a6;
                        if (!(aVar2 instanceof hc.a.b)) {
                            if (!(aVar2 instanceof hc.a.C0222a)) {
                                if (!(aVar2 instanceof hc.a.c)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                triple = new Triple("No MediaFile elements found in Linear Ad.", "VASTRenderable no MediaFiles found in VAST Linear creative", Boxing.boxInt(400));
                            } else {
                                triple = new Triple("No suitable MediaFile found for Linear Ad.", "VASTRenderable no suitable MediaFile: available=" + arrayList2.size() + ", container=" + cgVar.d() + VastAttributes.HORIZONTAL_POSITION + cgVar.b() + ", specs=[" + joinToString$default + X3.j.e, Boxing.boxInt(405));
                            }
                        } else {
                            triple = new Triple("All MediaFiles are VPAID (application/javascript). VPAID is not supported.", "VASTRenderable all MediaFiles are VPAID: available=" + arrayList2.size() + ", specs=[" + joinToString$default + X3.j.e, Boxing.boxInt(403));
                        }
                        String str4 = (String) triple.component1();
                        String str5 = (String) triple.component2();
                        int intValue = ((Number) triple.component3()).intValue();
                        xb.b(str5, (Throwable) null, 2, (Object) null);
                        throw new ChartboostError.Load.VastError(str4 + " (VAST error " + intValue + ")", new uj(str4, intValue));
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    URL url4 = (URL) bVar.m;
                    d2 = (String) bVar.l;
                    a3 = (fc) bVar.k;
                    a2 = (y4) bVar.j;
                    List list2 = (List) bVar.i;
                    Set set2 = (Set) bVar.h;
                    arrayList3 = (List) bVar.g;
                    arrayList2 = (List) bVar.f;
                    arrayList = (List) bVar.e;
                    qjVar2 = (qj) bVar.d;
                    context2 = (Context) bVar.c;
                    pjVar = (pj) bVar.b;
                    ResultKt.throwOnFailure(obj);
                    url = url4;
                    list = list2;
                    set = set2;
                }
                xb.a("Supported codecs for " + d2 + ": " + CollectionsKt.joinToString$default((List) obj, ", ", null, null, 0, null, null, 62, null), (Throwable) null, 2, (Object) null);
                int indexOf = arrayList2.indexOf(a3);
                pjVar.x = (indexOf != -1 || indexOf >= arrayList3.size()) ? null : (mk) arrayList3.get(indexOf);
                z7 z7Var = new z7(new c6(), new d6(), null, 4, null);
                wf w = pjVar.w();
                a0 q = pjVar.q();
                b7 i3 = f4.b.a().i();
                List<qi> c3 = qjVar2.c();
                ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(c3, 10));
                for (qi qiVar : c3) {
                    arrayList5.add(new qi(qiVar.a(), qiVar.e(), qiVar.c(), qiVar.d(), qiVar.b(), null, 32, null));
                }
                mkVar = pjVar.x;
                if (mkVar == null && (b3 = mkVar.b()) != null) {
                    emptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(b3, 10));
                    Iterator it3 = b3.iterator();
                    while (it3.hasNext()) {
                        emptyList.add(new qi("click", (String) it3.next(), 0, null, null, null, 56, null));
                    }
                } else {
                    emptyList = CollectionsKt.emptyList();
                }
                Set mutableSet = CollectionsKt.toMutableSet(CollectionsKt.plus((Collection) arrayList5, (Iterable) emptyList));
                pjVar.y = mutableSet;
                mk mkVar2 = pjVar.x;
                wk wkVar = new wk(context2, url, w, q, i3, z7Var, mutableSet, mkVar2 == null ? mkVar2.a() : null, pjVar.p, pjVar.x(), pjVar.q, set, list, pjVar.p(), pjVar.v(), pjVar.v);
                wkVar.a(pjVar);
                Unit unit3 = Unit.INSTANCE;
                arrayList.add(wkVar);
                if (a2 != null) {
                    ak a7 = a2.a();
                    if (a7 == null) {
                        List h2 = a2.h();
                        String str6 = h2 != null ? "static:" + h2.size() : null;
                        List e3 = a2.e();
                        String str7 = e3 != null ? "html:" + e3.size() : null;
                        List f2 = a2.f();
                        String joinToString$default2 = CollectionsKt.joinToString$default(CollectionsKt.listOfNotNull((Object[]) new String[]{str6, str7, f2 != null ? "iframe:" + f2.size() : null}), ", ", null, null, 0, null, null, 62, null);
                        if (joinToString$default2.length() == 0) {
                            joinToString$default2 = "none";
                        }
                        xb.e("VASTRenderable companion ad has no usable resource: companionSize=" + a2.j() + VastAttributes.HORIZONTAL_POSITION + a2.d() + ", resourceTypes=[" + joinToString$default2 + X3.j.e, null, 2, null);
                    } else {
                        List c4 = qjVar2.c();
                        ArrayList arrayList6 = new ArrayList();
                        for (Object obj2 : c4) {
                            if (Intrinsics.areEqual(((qi) obj2).a(), "error")) {
                                arrayList6.add(obj2);
                            }
                        }
                        List mutableList = CollectionsKt.toMutableList((Collection) pjVar.w().f());
                        for (qi qiVar2 : a2.i()) {
                            String e4 = qiVar2.e();
                            if (e4 != null) {
                                String a8 = qiVar2.a();
                                if (a8 == null) {
                                    a8 = "unknown";
                                }
                                mutableList.add(new o7(a8, C4701ic.a, e4, "", null));
                                Unit unit4 = Unit.INSTANCE;
                            }
                        }
                        String b5 = pjVar.w().b();
                        String l = pjVar.w().l();
                        Map g2 = pjVar.w().g();
                        long c5 = pjVar.w().c();
                        nj o2 = pjVar.w().o();
                        n5 b6 = o2 != null ? o2.b() : null;
                        nj o3 = pjVar.w().o();
                        c9 j = pjVar.w().j();
                        int k = pjVar.w().k();
                        boolean e5 = pjVar.w().e();
                        nj o4 = pjVar.w().o();
                        wf wfVar = new wf(b5, l, g2, c5, b6, mutableList, o3, j, k, e5, false, o4 != null ? o4.d() : true, null, null, null, 29696, null);
                        if (a7 instanceof e9) {
                            str = ((e9) a7).a();
                        } else if (a7 instanceof l9) {
                            str = ((l9) a7).a();
                        } else {
                            if (a7 instanceof lh) {
                                lh lhVar = (lh) a7;
                                String b7 = lhVar.b();
                                if (Intrinsics.areEqual("application/x-javascript", lhVar.a()) && b7 != null) {
                                    z = true;
                                    if (StringsKt.endsWith$default(b7, ".js", false, 2, (Object) null)) {
                                        str = b7;
                                    }
                                }
                                str = b7;
                            } else {
                                xb.e("Unknown VAST companion resource type encountered: " + a7.getClass().getSimpleName(), null, 2, null);
                                z = false;
                                str = null;
                            }
                            if (str != null || StringsKt.isBlank(str)) {
                                xb.e("Companion resource content string is null or blank; skipping.", null, 2, null);
                            } else {
                                if (z) {
                                    vfVar = new rl(context2, StringsKt.trimIndent("\n                    <!DOCTYPE html>\n                    <html style=\"width: 100%; height: 100%; margin: 0; padding: 0;\">\n                    <head>\n                        <meta charset=\"UTF-8\">\n                        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n                        <style>\n                            /* Basic CSS Reset & Full-Screen Setup */\n                            html, body {\n                                width: 100%;\n                                height: 100%;\n                                margin: 0;\n                                padding: 0;\n                                overflow: hidden; /* Prevent unexpected scrollbars */\n                                box-sizing: border-box; /* Use border-box sizing globally */\n                                background-color: transparent; /* Start transparent */\n                            }\n                            /* Ensure all elements inherit border-box */\n                            *, *:before, *:after {\n                                box-sizing: inherit;\n                            }\n                        </style>\n                    </head>\n                    <body style=\"position: relative;\">\n                        <script id=\"vast-companion-script\" src=\"" + str + "\" defer crossorigin=\"anonymous\"></script>\n                        </body>\n                    </html>\n                    "), null, yc.d, a2, pjVar.s, wfVar, pjVar.q(), pjVar.p, pjVar.x(), pjVar.p(), pjVar.q, pjVar.v(), null, pjVar.t, pjVar.u, arrayList6, 8196, null);
                                } else {
                                    try {
                                        url2 = new URL(str);
                                    } catch (MalformedURLException unused) {
                                        xb.a("Companion content failed URL parsing. Assuming it's an HTML snippet or invalid. Content: \"" + str + "\"", (Throwable) null, 2, (Object) null);
                                        url2 = null;
                                    }
                                    if (url2 != null) {
                                        String path = url2.getPath();
                                        if (path != null) {
                                            Intrinsics.checkNotNull(path);
                                            str2 = path.toLowerCase(Locale.ROOT);
                                            Intrinsics.checkNotNullExpressionValue(str2, "toLowerCase(...)");
                                        }
                                        str2 = "";
                                        if (!StringsKt.endsWith$default(str2, ".png", false, 2, (Object) null) && !StringsKt.endsWith$default(str2, BrandSafetyUtils.a, false, 2, (Object) null) && !StringsKt.endsWith$default(str2, ".jpeg", false, 2, (Object) null) && !StringsKt.endsWith$default(str2, ".gif", false, 2, (Object) null) && !StringsKt.endsWith$default(str2, ".webp", false, 2, (Object) null)) {
                                            vfVar = new rl(context2, null, url2, yc.d, a2, pjVar.s, wfVar, pjVar.q(), pjVar.p, pjVar.x(), pjVar.p(), pjVar.q, pjVar.v(), null, pjVar.t, pjVar.u, arrayList6, 8194, null);
                                        } else {
                                            vfVar = new v9(context2, url2, a2, wfVar, pjVar.q(), pjVar.r, pjVar.p, pjVar.x(), pjVar.p(), pjVar.v(), pjVar.t, pjVar.u, arrayList6);
                                        }
                                    } else if (new Regex("<\\s*(html|body|div|p|a|img|iframe|script|style)\\b", RegexOption.IGNORE_CASE).containsMatchIn(str)) {
                                        vfVar = new rl(context2, str, null, yc.d, a2, pjVar.s, wfVar, pjVar.q(), pjVar.p, pjVar.x(), pjVar.p(), pjVar.q, pjVar.v(), null, pjVar.t, pjVar.u, arrayList6, 8196, null);
                                    } else {
                                        xb.e("Cannot determine renderable type from string content heuristics (Not URL, no common HTML tags found). Skipping content: \"" + str + "\"", null, 2, null);
                                        vfVar = null;
                                    }
                                }
                                if (vfVar != null) {
                                    vfVar.a(pjVar);
                                    Boxing.boxBoolean(arrayList.add(vfVar));
                                }
                            }
                        }
                        z = false;
                        if (str != null) {
                        }
                        xb.e("Companion resource content string is null or blank; skipping.", null, 2, null);
                    }
                    Unit unit5 = Unit.INSTANCE;
                }
                return arrayList;
            }
        }
        bVar = new b(continuation);
        Object obj3 = bVar.n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = bVar.p;
        if (i != 0) {
        }
        xb.a("Supported codecs for " + d2 + ": " + CollectionsKt.joinToString$default((List) obj3, ", ", null, null, 0, null, null, 62, null), (Throwable) null, 2, (Object) null);
        int indexOf2 = arrayList2.indexOf(a3);
        pjVar.x = (indexOf2 != -1 || indexOf2 >= arrayList3.size()) ? null : (mk) arrayList3.get(indexOf2);
        z7 z7Var2 = new z7(new c6(), new d6(), null, 4, null);
        wf w2 = pjVar.w();
        a0 q2 = pjVar.q();
        b7 i32 = f4.b.a().i();
        List<qi> c32 = qjVar2.c();
        ArrayList arrayList52 = new ArrayList(CollectionsKt.collectionSizeOrDefault(c32, 10));
        while (r1.hasNext()) {
        }
        mkVar = pjVar.x;
        if (mkVar == null) {
        }
        emptyList = CollectionsKt.emptyList();
        Set mutableSet2 = CollectionsKt.toMutableSet(CollectionsKt.plus((Collection) arrayList52, (Iterable) emptyList));
        pjVar.y = mutableSet2;
        mk mkVar22 = pjVar.x;
        wk wkVar2 = new wk(context2, url, w2, q2, i32, z7Var2, mutableSet2, mkVar22 == null ? mkVar22.a() : null, pjVar.p, pjVar.x(), pjVar.q, set, list, pjVar.p(), pjVar.v(), pjVar.v);
        wkVar2.a(pjVar);
        Unit unit32 = Unit.INSTANCE;
        arrayList.add(wkVar2);
        if (a2 != null) {
        }
        return arrayList;
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final od z() {
        return this.w;
    }

    public final mk A() {
        return this.x;
    }

    public static final class d implements c7 {
        public d() {
        }

        @Override // com.chartboost.sdk.impl.c7
        public void b(boolean z) {
            od z2 = pj.this.z();
            if (z2 != null) {
                z2.b(z);
            }
        }
    }

    public static final class g extends Lambda implements Function0 {
        public final /* synthetic */ wk b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(wk wkVar) {
            super(0);
            this.b = wkVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo4828invoke() {
            return Boolean.valueOf(this.b.J());
        }
    }

    public static final class h extends Lambda implements Function0 {
        public final /* synthetic */ wk b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(wk wkVar) {
            super(0);
            this.b = wkVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo4828invoke() {
            return Boolean.valueOf(this.b.J());
        }
    }

    @Override // com.chartboost.sdk.impl.vf
    public boolean i() {
        od odVar = this.w;
        return odVar != null && odVar.i();
    }

    @Override // com.chartboost.sdk.impl.vf
    public View k() {
        od odVar = this.w;
        if (odVar != null) {
            return odVar.k();
        }
        return null;
    }

    @Override // com.chartboost.sdk.impl.vf
    public Bitmap g() {
        m2 t;
        od odVar = this.w;
        if (odVar == null || (t = odVar.t()) == null) {
            return null;
        }
        return t.g();
    }

    @Override // com.chartboost.sdk.impl.vf
    public long h() {
        od odVar = this.w;
        if (odVar != null) {
            return odVar.h();
        }
        return 0L;
    }

    @Override // com.chartboost.sdk.impl.m2
    public void y() {
        List w;
        String c2 = q().c();
        od odVar = this.w;
        xb.a("VAST starting: auctionId=" + c2 + ", renderableCount=" + ((odVar == null || (w = odVar.w()) == null) ? 0 : w.size()), (Throwable) null, 2, (Object) null);
        od odVar2 = this.w;
        if (odVar2 != null) {
            odVar2.y();
        }
    }

    @Override // com.chartboost.sdk.impl.vf
    public void l() {
        od odVar = this.w;
        if (odVar != null) {
            odVar.l();
        }
    }

    @Override // com.chartboost.sdk.impl.vf
    public void m() {
        od odVar = this.w;
        if (odVar != null) {
            odVar.m();
        }
    }

    @Override // com.chartboost.sdk.impl.vf
    public void n() {
        od odVar = this.w;
        if (odVar != null) {
            odVar.n();
        }
    }

    public final boolean B() {
        od odVar = this.w;
        return odVar != null && odVar.u() > 0;
    }

    @Override // com.chartboost.sdk.impl.m2
    public long t() {
        n5 b2;
        od odVar = this.w;
        if (odVar != null && odVar.u() == 0) {
            return super.t();
        }
        nj o = w().o();
        if (o == null || (b2 = o.b()) == null) {
            return 0L;
        }
        return b2.b();
    }

    @Override // com.chartboost.sdk.impl.m2
    public long s() {
        n5 b2;
        od odVar = this.w;
        if (odVar != null && odVar.u() == 0) {
            return super.s();
        }
        nj o = w().o();
        if (o == null || (b2 = o.b()) == null) {
            return 0L;
        }
        return b2.a();
    }

    @Override // com.chartboost.sdk.impl.m2
    public int u() {
        od odVar = this.w;
        if (odVar != null && odVar.u() == 0) {
            return super.u();
        }
        nj o = w().o();
        if (o != null) {
            return o.c();
        }
        return 0;
    }

    @Override // com.chartboost.sdk.impl.zf
    public void f() {
        zf j = j();
        if (j != null) {
            j.f();
        }
    }

    @Override // com.chartboost.sdk.impl.vf
    public void o() {
        od odVar = this.w;
        if (odVar != null) {
            odVar.o();
        }
    }

    private final List a(String str) {
        Set set = this.y;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (Intrinsics.areEqual(((qi) obj).a(), str)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void a(List list) {
        if (list.isEmpty()) {
            return;
        }
        xb.a("Firing " + list.size() + " accumulated VAST parse error event(s)", (Throwable) null, 2, (Object) null);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            oj.a.a(bk.f.b, new ck(null, (qi) it.next(), this.n, this.t, this.u, null, null, null, null, null, null, null, null, null, 16353, null));
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // com.chartboost.sdk.impl.vf
    public java.lang.Object a(android.content.Context r36, kotlin.coroutines.Continuation r37) {
        /*
            Method dump skipped, instructions count: 1767
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.pj.a(android.content.Context, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.chartboost.sdk.impl.vf
    public float a(boolean z) {
        od odVar = this.w;
        if (odVar != null) {
            return odVar.a(z);
        }
        return 1.0f;
    }

    @Override // com.chartboost.sdk.impl.zf
    public void a() {
        zf j = j();
        if (j != null) {
            j.a();
        }
    }

    @Override // com.chartboost.sdk.impl.zf
    public void a(re request) {
        Intrinsics.checkNotNullParameter(request, "request");
        zf j = j();
        if (j != null) {
            j.a(request);
        }
    }

    @Override // com.chartboost.sdk.impl.vf
    public void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        od odVar = this.w;
        if (odVar != null) {
            odVar.a(context);
        }
    }

    @Override // com.chartboost.sdk.impl.vf
    public void a(nh reason) {
        m2 t;
        Intrinsics.checkNotNullParameter(reason, "reason");
        String c2 = q().c();
        od odVar = this.w;
        xb.a("VAST stopping: auctionId=" + c2 + ", reason=" + reason + ", currentAdIndex=" + (odVar != null ? odVar.u() : -1), (Throwable) null, 2, (Object) null);
        if (reason == nh.c) {
            od odVar2 = this.w;
            if (odVar2 != null) {
                a(bk.c.b);
                a(bk.b.b);
                odVar2.a(reason);
                this.w = null;
                return;
            }
            return;
        }
        od odVar3 = this.w;
        if (odVar3 == null || (t = odVar3.t()) == null) {
            return;
        }
        t.a(reason);
    }

    public final Object a(Throwable th, qj qjVar) {
        Throwable vastError;
        Collection<qi> emptyList;
        List c2;
        Integer c3 = c(th);
        int intValue = c3 != null ? c3.intValue() : POBVastError.UNDEFINED_ERROR;
        String message = th.getMessage();
        if (message == null) {
            message = "Unknown VAST error";
        }
        if (th instanceof ChartboostError.Load) {
            vastError = (ChartboostError.Load) th;
        } else {
            vastError = new ChartboostError.Load.VastError(message, th);
        }
        xb.b("VAST processing error (" + intValue + "): " + message, th);
        if (qjVar != null && (c2 = qjVar.c()) != null) {
            emptyList = new ArrayList();
            for (Object obj : c2) {
                if (Intrinsics.areEqual(((qi) obj).a(), "error")) {
                    emptyList.add(obj);
                }
            }
        } else {
            emptyList = CollectionsKt.emptyList();
        }
        if (!emptyList.isEmpty()) {
            for (qi qiVar : emptyList) {
                if (!qiVar.b().containsKey("VAST_ERROR_CODE")) {
                    qiVar = qi.a(qiVar, null, null, 0, null, MapsKt.plus(qiVar.b(), TuplesKt.to("VAST_ERROR_CODE", Integer.valueOf(intValue))), null, 47, null);
                }
                oj.a.a(bk.f.b, new ck(null, qiVar, this.n, this.t, this.u, null, null, null, null, null, null, null, null, null, 16353, null));
            }
        } else {
            a(intValue);
            xb.e("VAST error " + intValue + " (" + message + ") occurred, but no <Error> tracking URLs found in VAST.", null, 2, null);
        }
        Result.Companion companion = Result.INSTANCE;
        return Result.m8023constructorimpl(ResultKt.createFailure(vastError));
    }

    @Override // com.chartboost.sdk.impl.vf
    public void a(boolean z, Integer num, Integer num2, i4 i4Var) {
        Unit unit;
        m2 t;
        od odVar = this.w;
        if (odVar == null || (t = odVar.t()) == null) {
            unit = null;
        } else {
            t.a(z, num, num2, i4Var);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            xb.e("Failed to track a click for VAST because no current ad", null, 2, null);
        }
    }

    private final void a(bk bkVar) {
        Iterator it = a(bkVar.a()).iterator();
        while (it.hasNext()) {
            a(bkVar, (qi) it.next());
        }
    }

    private final void a(bk bkVar, qi qiVar) {
        m2 m2Var;
        URL N;
        List w;
        Object obj;
        od odVar = this.w;
        if (odVar == null || (w = odVar.w()) == null) {
            m2Var = null;
        } else {
            Iterator it = w.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((m2) obj) instanceof wk) {
                        break;
                    }
                }
            }
            m2Var = (m2) obj;
        }
        wk wkVar = m2Var instanceof wk ? (wk) m2Var : null;
        oj ojVar = oj.a;
        Context context = this.n;
        he heVar = this.t;
        y2 y2Var = this.u;
        Boolean valueOf = wkVar != null ? Boolean.valueOf(wkVar.I()) : null;
        u p = p();
        n5 d2 = w().d();
        ojVar.a(bkVar, new ck(null, qiVar, context, heVar, y2Var, valueOf, p, null, null, wkVar != null ? Long.valueOf(wkVar.M()) : null, d2 != null ? Long.valueOf(d2.b()) : null, wkVar != null ? wkVar.L() : null, (wkVar == null || (N = wkVar.N()) == null) ? null : N.toString(), wkVar != null ? Long.valueOf(wkVar.H()) : null, 385, null));
    }

    @Override // com.chartboost.sdk.impl.vf
    public void a(float f2, boolean z) {
        od odVar = this.w;
        if (odVar != null) {
            odVar.a(f2, z);
        }
    }

    public final void a(int i) {
        oj.a.a(bk.f.b, new ck(null, new qi("error", null, 0, null, MapsKt.mapOf(TuplesKt.to("VAST_ERROR_CODE", Integer.valueOf(i))), null, 40, null), this.n, this.t, this.u, null, null, null, null, null, null, null, null, null, 16353, null));
    }
}
