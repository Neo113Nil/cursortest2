package com.google.android.gms.internal.ads;

import O.C0334a;
import O.C0336b;
import O.C0357t;
import android.os.Trace;
import android.util.JsonReader;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.consent_sdk.C4392v;
import g1.C4524d;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import t0.AbstractC5019C;
import t0.AbstractC5032P;
import t0.AbstractC5051n;
import t0.AbstractC5059v;
import t0.AbstractC5063z;
import t0.C5020D;
import t0.C5023G;
import t0.C5024H;
import t0.C5029M;
import t0.C5033Q;
import t0.C5045h;

/* loaded from: classes2.dex */
public final class BP {

    /* renamed from: a, reason: collision with root package name */
    public int f24035a;

    /* renamed from: b, reason: collision with root package name */
    public int f24036b;

    /* renamed from: c, reason: collision with root package name */
    public Object f24037c;

    /* renamed from: d, reason: collision with root package name */
    public Object f24038d;

    /* renamed from: e, reason: collision with root package name */
    public Object f24039e;

    /* renamed from: f, reason: collision with root package name */
    public Object f24040f;

    /* renamed from: g, reason: collision with root package name */
    public Object f24041g;

    /* renamed from: h, reason: collision with root package name */
    public Object f24042h;

    public BP(TP tp, TP tp2, int i, int i4, C3366iP c3366iP, C3213fh c3213fh, AbstractC3832r8 abstractC3832r8, Object obj) {
        this.f24037c = tp;
        this.f24038d = tp2;
        this.f24035a = i;
        this.f24036b = i4;
        this.f24039e = c3366iP;
        this.f24040f = c3213fh;
        this.f24041g = abstractC3832r8;
        this.f24042h = obj;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static BP l(JsonReader jsonReader) {
        boolean z8;
        String nextString;
        boolean z9;
        char c4;
        int i;
        BP bp = new BP();
        bp.f24035a = 1;
        List list = Collections.EMPTY_LIST;
        bp.f24040f = list;
        bp.f24041g = list;
        bp.f24036b = 1;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            int i4 = 7;
            int i9 = 3;
            switch (nextName.hashCode()) {
                case -2001388947:
                    if (nextName.equals("consent_signal")) {
                        z8 = false;
                        break;
                    }
                    z8 = -1;
                    break;
                case -1938755376:
                    if (nextName.equals("error_message")) {
                        z8 = 3;
                        break;
                    }
                    z8 = -1;
                    break;
                case -1851537225:
                    if (nextName.equals("consent_form_base_url")) {
                        z8 = 2;
                        break;
                    }
                    z8 = -1;
                    break;
                case -1734348803:
                    if (nextName.equals("client_side_pingback_url")) {
                        z8 = 7;
                        break;
                    }
                    z8 = -1;
                    break;
                case -1324537865:
                    if (nextName.equals("privacy_options_required")) {
                        z8 = 6;
                        break;
                    }
                    z8 = -1;
                    break;
                case -1161803523:
                    if (nextName.equals("actions")) {
                        z8 = 5;
                        break;
                    }
                    z8 = -1;
                    break;
                case -986806987:
                    if (nextName.equals("request_info_keys")) {
                        z8 = 4;
                        break;
                    }
                    z8 = -1;
                    break;
                case -790907624:
                    if (nextName.equals("consent_form_payload")) {
                        z8 = true;
                        break;
                    }
                    z8 = -1;
                    break;
                default:
                    z8 = -1;
                    break;
            }
            switch (z8) {
                case false:
                    nextString = jsonReader.nextString();
                    switch (nextString) {
                        case "CONSENT_SIGNAL_UNKNOWN":
                            i4 = 1;
                            bp.f24035a = i4;
                            break;
                        case "CONSENT_SIGNAL_PERSONALIZED_ADS":
                            i4 = 2;
                            bp.f24035a = i4;
                            break;
                        case "CONSENT_SIGNAL_NON_PERSONALIZED_ADS":
                            i4 = 3;
                            bp.f24035a = i4;
                            break;
                        case "CONSENT_SIGNAL_SUFFICIENT":
                            i4 = 4;
                            bp.f24035a = i4;
                            break;
                        case "CONSENT_SIGNAL_COLLECT_CONSENT":
                            i4 = 5;
                            bp.f24035a = i4;
                            break;
                        case "CONSENT_SIGNAL_NOT_REQUIRED":
                            i4 = 6;
                            bp.f24035a = i4;
                            break;
                        case "CONSENT_SIGNAL_ERROR":
                            bp.f24035a = i4;
                            break;
                        case "CONSENT_SIGNAL_PUBLISHER_MISCONFIGURATION":
                            i4 = 8;
                            bp.f24035a = i4;
                            break;
                        default:
                            throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(nextString));
                    }
                case true:
                    bp.f24037c = jsonReader.nextString();
                    break;
                case true:
                    bp.f24038d = jsonReader.nextString();
                    break;
                case true:
                    bp.f24039e = jsonReader.nextString();
                    break;
                case true:
                    bp.f24040f = new ArrayList();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        ((List) bp.f24040f).add(jsonReader.nextString());
                    }
                    jsonReader.endArray();
                    break;
                case true:
                    bp.f24041g = new ArrayList();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        C4392v c4392v = new C4392v();
                        c4392v.f35935b = 1;
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            String nextName2 = jsonReader.nextName();
                            int hashCode = nextName2.hashCode();
                            if (hashCode != -2105551094) {
                                if (hashCode == 1583758243 && nextName2.equals("action_type")) {
                                    z9 = false;
                                }
                                z9 = -1;
                            } else {
                                if (nextName2.equals("args_json")) {
                                    z9 = true;
                                }
                                z9 = -1;
                            }
                            if (!z9) {
                                String nextString2 = jsonReader.nextString();
                                int hashCode2 = nextString2.hashCode();
                                if (hashCode2 == 64208429) {
                                    if (nextString2.equals("CLEAR")) {
                                        c4 = 2;
                                        if (c4 != 0) {
                                        }
                                        c4392v.f35935b = i;
                                    }
                                    c4 = 65535;
                                    if (c4 != 0) {
                                    }
                                    c4392v.f35935b = i;
                                } else if (hashCode2 != 82862015) {
                                    if (hashCode2 == 1856333582 && nextString2.equals("UNKNOWN_ACTION_TYPE")) {
                                        c4 = 0;
                                        if (c4 != 0) {
                                            i = 1;
                                        } else if (c4 == 1) {
                                            i = 2;
                                        } else {
                                            if (c4 != 2) {
                                                throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.Action.ActionTypefrom: ".concat(nextString2));
                                            }
                                            i = 3;
                                        }
                                        c4392v.f35935b = i;
                                    }
                                    c4 = 65535;
                                    if (c4 != 0) {
                                    }
                                    c4392v.f35935b = i;
                                } else {
                                    if (nextString2.equals("WRITE")) {
                                        c4 = 1;
                                        if (c4 != 0) {
                                        }
                                        c4392v.f35935b = i;
                                    }
                                    c4 = 65535;
                                    if (c4 != 0) {
                                    }
                                    c4392v.f35935b = i;
                                }
                            } else if (!z9) {
                                jsonReader.skipValue();
                            } else {
                                c4392v.f35934a = jsonReader.nextString();
                            }
                        }
                        jsonReader.endObject();
                        ((List) bp.f24041g).add(c4392v);
                    }
                    jsonReader.endArray();
                    break;
                case true:
                    String nextString3 = jsonReader.nextString();
                    int hashCode3 = nextString3.hashCode();
                    if (hashCode3 != -1888946261) {
                        if (hashCode3 != 389487519) {
                            if (hashCode3 == 433141802 && nextString3.equals("UNKNOWN")) {
                            }
                        } else if (nextString3.equals("REQUIRED")) {
                        }
                    } else if (nextString3.equals("NOT_REQUIRED")) {
                    }
                    if (r8 == 0) {
                        i9 = 1;
                    } else if (r8 == 1) {
                        i9 = 2;
                    } else if (r8 != 2) {
                        throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.PrivacyOptionsRequirementStatusfrom: ".concat(nextString3));
                    }
                    bp.f24036b = i9;
                    break;
                case true:
                    bp.f24042h = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bp;
    }

    public void a(AbstractC5032P abstractC5032P, boolean z8) {
        RecyclerView.j(abstractC5032P);
        RecyclerView recyclerView = (RecyclerView) this.f24042h;
        C5033Q c5033q = recyclerView.f5352P0;
        if (c5033q != null) {
            a0.b bVar = c5033q.f40633e;
            View view = abstractC5032P.f40615a;
            O.X.o(view, bVar != null ? (C0336b) ((WeakHashMap) bVar.f4282f).remove(view) : null);
        }
        if (z8 && recyclerView.f5339I0 != null) {
            recyclerView.f5384y.p(abstractC5032P);
        }
        abstractC5032P.f40631r = null;
        C5024H c4 = c();
        c4.getClass();
        int i = abstractC5032P.f40620f;
        ArrayList arrayList = c4.a(i).f40580a;
        if (((C5023G) c4.f40584a.get(i)).f40581b <= arrayList.size()) {
            return;
        }
        abstractC5032P.m();
        arrayList.add(abstractC5032P);
    }

    public int b(int i) {
        RecyclerView recyclerView = (RecyclerView) this.f24042h;
        if (i >= 0 && i < recyclerView.f5339I0.b()) {
            return !recyclerView.f5339I0.f40600g ? i : recyclerView.f5380w.m(i, 0);
        }
        StringBuilder l9 = CL.l(i, "invalid position ", ". State item count is ");
        l9.append(recyclerView.f5339I0.b());
        l9.append(recyclerView.y());
        throw new IndexOutOfBoundsException(l9.toString());
    }

    public C5024H c() {
        if (((C5024H) this.f24041g) == null) {
            C5024H c5024h = new C5024H();
            c5024h.f40584a = new SparseArray();
            c5024h.f40585b = 0;
            this.f24041g = c5024h;
        }
        return (C5024H) this.f24041g;
    }

    public void d() {
        ArrayList arrayList = (ArrayList) this.f24039e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            e(size);
        }
        arrayList.clear();
        int[] iArr = RecyclerView.f5320Y0;
        C2830Vl c2830Vl = ((RecyclerView) this.f24042h).f5337H0;
        int[] iArr2 = c2830Vl.f28296c;
        if (iArr2 != null) {
            Arrays.fill(iArr2, -1);
        }
        c2830Vl.f28297d = 0;
    }

    public void e(int i) {
        ArrayList arrayList = (ArrayList) this.f24039e;
        a((AbstractC5032P) arrayList.get(i), true);
        arrayList.remove(i);
    }

    public void f(View view) {
        AbstractC5032P I2 = RecyclerView.I(view);
        boolean j9 = I2.j();
        RecyclerView recyclerView = (RecyclerView) this.f24042h;
        if (j9) {
            recyclerView.removeDetachedView(view, false);
        }
        if (I2.i()) {
            I2.f40627n.j(I2);
        } else if (I2.p()) {
            I2.f40623j &= -33;
        }
        g(I2);
        if (recyclerView.f5372q0 == null || I2.g()) {
            return;
        }
        recyclerView.f5372q0.d(I2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0094, code lost:
    
        r5 = r5 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void g(AbstractC5032P abstractC5032P) {
        boolean z8;
        boolean z9;
        boolean i = abstractC5032P.i();
        boolean z10 = true;
        RecyclerView recyclerView = (RecyclerView) this.f24042h;
        View view = abstractC5032P.f40615a;
        if (i || view.getParent() != null) {
            StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(abstractC5032P.i());
            sb.append(" isAttached:");
            sb.append(view.getParent() != null);
            sb.append(recyclerView.y());
            throw new IllegalArgumentException(sb.toString());
        }
        if (abstractC5032P.j()) {
            throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + abstractC5032P + recyclerView.y());
        }
        if (abstractC5032P.o()) {
            throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + recyclerView.y());
        }
        if ((abstractC5032P.f40623j & 16) == 0) {
            WeakHashMap weakHashMap = O.X.f2240a;
            if (view.hasTransientState()) {
                z8 = true;
                AbstractC5059v abstractC5059v = recyclerView.f5328D;
                if (abstractC5032P.g()) {
                    z10 = false;
                } else {
                    if (this.f24036b <= 0 || (abstractC5032P.f40623j & 526) != 0) {
                        z9 = false;
                    } else {
                        ArrayList arrayList = (ArrayList) this.f24039e;
                        int size = arrayList.size();
                        if (size >= this.f24036b && size > 0) {
                            e(0);
                            size--;
                        }
                        int[] iArr = RecyclerView.f5320Y0;
                        if (size > 0) {
                            C2830Vl c2830Vl = recyclerView.f5337H0;
                            int i4 = abstractC5032P.f40617c;
                            if (c2830Vl.f28296c != null) {
                                int i9 = c2830Vl.f28297d * 2;
                                for (int i10 = 0; i10 < i9; i10 += 2) {
                                    if (c2830Vl.f28296c[i10] == i4) {
                                        break;
                                    }
                                }
                            }
                            int i11 = size - 1;
                            loop1: while (i11 >= 0) {
                                int i12 = ((AbstractC5032P) arrayList.get(i11)).f40617c;
                                C2830Vl c2830Vl2 = recyclerView.f5337H0;
                                if (c2830Vl2.f28296c == null) {
                                    break;
                                }
                                int i13 = c2830Vl2.f28297d * 2;
                                for (int i14 = 0; i14 < i13; i14 += 2) {
                                    if (c2830Vl2.f28296c[i14] == i12) {
                                        break;
                                    }
                                }
                                break loop1;
                            }
                            size = i11 + 1;
                        }
                        arrayList.add(size, abstractC5032P);
                        z9 = true;
                    }
                    if (z9) {
                        z10 = false;
                    } else {
                        a(abstractC5032P, true);
                    }
                    r1 = z9;
                }
                recyclerView.f5384y.p(abstractC5032P);
                if (r1 && !z10 && z8) {
                    abstractC5032P.f40631r = null;
                    return;
                }
                return;
            }
        }
        z8 = false;
        AbstractC5059v abstractC5059v2 = recyclerView.f5328D;
        if (abstractC5032P.g()) {
        }
        recyclerView.f5384y.p(abstractC5032P);
        if (r1) {
        }
    }

    public void h(View view) {
        AbstractC5063z abstractC5063z;
        AbstractC5032P I2 = RecyclerView.I(view);
        boolean z8 = (I2.f40623j & 12) != 0;
        RecyclerView recyclerView = (RecyclerView) this.f24042h;
        if (!z8 && I2.k() && (abstractC5063z = recyclerView.f5372q0) != null) {
            C5045h c5045h = (C5045h) abstractC5063z;
            if (I2.c().isEmpty() && c5045h.f40701g && !I2.f()) {
                if (((ArrayList) this.f24038d) == null) {
                    this.f24038d = new ArrayList();
                }
                I2.f40627n = this;
                I2.f40628o = true;
                ((ArrayList) this.f24038d).add(I2);
                return;
            }
        }
        if (I2.f() && !I2.h() && !recyclerView.f5328D.f40800b) {
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + recyclerView.y());
        }
        I2.f40627n = this;
        I2.f40628o = false;
        ((ArrayList) this.f24037c).add(I2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:192:0x0438, code lost:
    
        if (r11.f() == false) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01e5, code lost:
    
        if (r11.f40620f != 0) goto L110;
     */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0547 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0158  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC5032P i(int i, long j9) {
        boolean z8;
        AbstractC5032P abstractC5032P;
        boolean z9;
        long j10;
        C0336b c0336b;
        boolean z10;
        View view;
        boolean z11;
        AbstractC5059v abstractC5059v;
        ArrayList arrayList;
        ViewGroup.LayoutParams layoutParams;
        long j11;
        AccessibilityManager accessibilityManager;
        boolean z12;
        boolean z13;
        ViewGroup.LayoutParams layoutParams2;
        C5020D c5020d;
        int i4;
        View view2;
        int d2;
        boolean z14;
        int size;
        int m8;
        boolean z15 = true;
        RecyclerView recyclerView = (RecyclerView) this.f24042h;
        if (i < 0 || i >= recyclerView.f5339I0.b()) {
            StringBuilder h9 = AbstractC5051n.h(i, i, "Invalid item position ", "(", "). Item count:");
            h9.append(recyclerView.f5339I0.b());
            h9.append(recyclerView.y());
            throw new IndexOutOfBoundsException(h9.toString());
        }
        C5029M c5029m = recyclerView.f5339I0;
        if (c5029m.f40600g) {
            ArrayList arrayList2 = (ArrayList) this.f24038d;
            if (arrayList2 != null && (size = arrayList2.size()) != 0) {
                int i9 = 0;
                while (true) {
                    if (i9 < size) {
                        abstractC5032P = (AbstractC5032P) ((ArrayList) this.f24038d).get(i9);
                        if (!abstractC5032P.p() && abstractC5032P.b() == i) {
                            abstractC5032P.a(32);
                            break;
                        }
                        i9++;
                    } else if (recyclerView.f5328D.f40800b && (m8 = recyclerView.f5380w.m(i, 0)) > 0 && m8 < recyclerView.f5328D.a()) {
                        long b9 = recyclerView.f5328D.b(m8);
                        for (int i10 = 0; i10 < size; i10++) {
                            AbstractC5032P abstractC5032P2 = (AbstractC5032P) ((ArrayList) this.f24038d).get(i10);
                            if (!abstractC5032P2.p() && abstractC5032P2.f40619e == b9) {
                                abstractC5032P2.a(32);
                                abstractC5032P = abstractC5032P2;
                                break;
                            }
                        }
                    }
                }
            }
            abstractC5032P = null;
            z8 = abstractC5032P != null;
        } else {
            z8 = false;
            abstractC5032P = null;
        }
        ArrayList arrayList3 = (ArrayList) this.f24039e;
        ArrayList arrayList4 = (ArrayList) this.f24037c;
        if (abstractC5032P == null) {
            int size2 = arrayList4.size();
            for (int i11 = 0; i11 < size2; i11++) {
                AbstractC5032P abstractC5032P3 = (AbstractC5032P) arrayList4.get(i11);
                if (!abstractC5032P3.p() && abstractC5032P3.b() == i && !abstractC5032P3.f() && (c5029m.f40600g || !abstractC5032P3.h())) {
                    abstractC5032P3.a(32);
                    z9 = true;
                    abstractC5032P = abstractC5032P3;
                    break;
                }
            }
            ArrayList arrayList5 = (ArrayList) recyclerView.f5382x.f39327d;
            int size3 = arrayList5.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size3) {
                    z9 = z15;
                    view2 = null;
                    break;
                }
                view2 = (View) arrayList5.get(i12);
                AbstractC5032P I2 = RecyclerView.I(view2);
                z9 = z15;
                if (I2.b() == i && !I2.f() && !I2.h()) {
                    break;
                }
                i12++;
                z15 = z9;
            }
            if (view2 == null) {
                int size4 = arrayList3.size();
                int i13 = 0;
                while (true) {
                    if (i13 >= size4) {
                        abstractC5032P = null;
                        break;
                    }
                    AbstractC5032P abstractC5032P4 = (AbstractC5032P) arrayList3.get(i13);
                    if (!abstractC5032P4.f() && abstractC5032P4.b() == i && !abstractC5032P4.d()) {
                        arrayList3.remove(i13);
                        abstractC5032P = abstractC5032P4;
                        break;
                    }
                    i13++;
                }
            } else {
                AbstractC5032P I8 = RecyclerView.I(view2);
                m.Q0 q02 = recyclerView.f5382x;
                int indexOfChild = ((RecyclerView) ((C4524d) q02.f39325b).f37858u).indexOfChild(view2);
                if (indexOfChild < 0) {
                    throw new IllegalArgumentException("view is not a child, cannot hide " + view2);
                }
                C3288h1 c3288h1 = (C3288h1) q02.f39326c;
                if (!c3288h1.f(indexOfChild)) {
                    throw new RuntimeException("trying to unhide a view that was not hidden" + view2);
                }
                c3288h1.c(indexOfChild);
                q02.s(view2);
                m.Q0 q03 = recyclerView.f5382x;
                int indexOfChild2 = ((RecyclerView) ((C4524d) q03.f39325b).f37858u).indexOfChild(view2);
                if (indexOfChild2 != -1) {
                    C3288h1 c3288h12 = (C3288h1) q03.f39326c;
                    if (!c3288h12.f(indexOfChild2)) {
                        d2 = indexOfChild2 - c3288h12.d(indexOfChild2);
                        if (d2 != -1) {
                            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + I8 + recyclerView.y());
                        }
                        recyclerView.f5382x.c(d2);
                        h(view2);
                        I8.a(8224);
                        abstractC5032P = I8;
                    }
                }
                d2 = -1;
                if (d2 != -1) {
                }
            }
            if (abstractC5032P != null) {
                if (abstractC5032P.h()) {
                    z14 = c5029m.f40600g;
                } else {
                    int i14 = abstractC5032P.f40617c;
                    if (i14 < 0 || i14 >= recyclerView.f5328D.a()) {
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + abstractC5032P + recyclerView.y());
                    }
                    if (!c5029m.f40600g) {
                        recyclerView.f5328D.getClass();
                    }
                    AbstractC5059v abstractC5059v2 = recyclerView.f5328D;
                    if (!abstractC5059v2.f40800b || abstractC5032P.f40619e == abstractC5059v2.b(abstractC5032P.f40617c)) {
                        z14 = z9;
                    }
                    z14 = false;
                }
                if (z14) {
                    z8 = z9;
                } else {
                    abstractC5032P.a(4);
                    if (abstractC5032P.i()) {
                        recyclerView.removeDetachedView(abstractC5032P.f40615a, false);
                        abstractC5032P.f40627n.j(abstractC5032P);
                    } else if (abstractC5032P.p()) {
                        abstractC5032P.f40623j &= -33;
                    }
                    g(abstractC5032P);
                    abstractC5032P = null;
                }
            }
        } else {
            z9 = true;
        }
        if (abstractC5032P == null) {
            int m9 = recyclerView.f5380w.m(i, 0);
            if (m9 < 0 || m9 >= recyclerView.f5328D.a()) {
                StringBuilder h10 = AbstractC5051n.h(i, m9, "Inconsistency detected. Invalid item position ", "(offset:", ").state:");
                h10.append(c5029m.b());
                h10.append(recyclerView.y());
                throw new IndexOutOfBoundsException(h10.toString());
            }
            recyclerView.f5328D.getClass();
            AbstractC5059v abstractC5059v3 = recyclerView.f5328D;
            j10 = 3;
            if (abstractC5059v3.f40800b) {
                long b10 = abstractC5059v3.b(m9);
                int size5 = arrayList4.size() - 1;
                while (true) {
                    if (size5 >= 0) {
                        abstractC5032P = (AbstractC5032P) arrayList4.get(size5);
                        if (abstractC5032P.f40619e == b10 && !abstractC5032P.p()) {
                            if (abstractC5032P.f40620f == 0) {
                                abstractC5032P.a(32);
                                if (abstractC5032P.h() && !c5029m.f40600g) {
                                    abstractC5032P.f40623j = (abstractC5032P.f40623j & (-15)) | 2;
                                }
                            } else {
                                arrayList4.remove(size5);
                                View view3 = abstractC5032P.f40615a;
                                recyclerView.removeDetachedView(view3, false);
                                AbstractC5032P I9 = RecyclerView.I(view3);
                                I9.f40627n = null;
                                I9.f40628o = false;
                                I9.f40623j &= -33;
                                g(I9);
                            }
                        }
                        size5--;
                    } else {
                        int size6 = arrayList3.size() - 1;
                        while (true) {
                            if (size6 < 0) {
                                break;
                            }
                            AbstractC5032P abstractC5032P5 = (AbstractC5032P) arrayList3.get(size6);
                            if (abstractC5032P5.f40619e != b10 || abstractC5032P5.d()) {
                                size6--;
                            } else if (abstractC5032P5.f40620f == 0) {
                                arrayList3.remove(size6);
                                abstractC5032P = abstractC5032P5;
                            } else {
                                e(size6);
                            }
                        }
                        abstractC5032P = null;
                    }
                }
                if (abstractC5032P != null) {
                    abstractC5032P.f40617c = m9;
                    z8 = z9;
                }
            }
            if (abstractC5032P == null) {
                C5023G c5023g = (C5023G) c().f40584a.get(0);
                if (c5023g != null) {
                    ArrayList arrayList6 = c5023g.f40580a;
                    if (!arrayList6.isEmpty()) {
                        for (int size7 = arrayList6.size() - 1; size7 >= 0; size7--) {
                            if (!((AbstractC5032P) arrayList6.get(size7)).d()) {
                                abstractC5032P = (AbstractC5032P) arrayList6.remove(size7);
                                break;
                            }
                        }
                    }
                }
                abstractC5032P = null;
                if (abstractC5032P != null) {
                    abstractC5032P.m();
                    int[] iArr = RecyclerView.f5320Y0;
                }
            }
            if (abstractC5032P == null) {
                long nanoTime = recyclerView.getNanoTime();
                if (j9 != Long.MAX_VALUE) {
                    long j12 = ((C5024H) this.f24041g).a(0).f40582c;
                    if (!((j12 == 0 || j12 + nanoTime < j9) ? z9 : false)) {
                        return null;
                    }
                }
                c0336b = null;
                AbstractC5059v abstractC5059v4 = recyclerView.f5328D;
                abstractC5059v4.getClass();
                try {
                    int i15 = K.n.f1482a;
                    Trace.beginSection("RV CreateView");
                    abstractC5032P = abstractC5059v4.d(recyclerView);
                    View view4 = abstractC5032P.f40615a;
                    if (view4.getParent() != null) {
                        throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                    }
                    abstractC5032P.f40620f = 0;
                    Trace.endSection();
                    int[] iArr2 = RecyclerView.f5320Y0;
                    RecyclerView D8 = RecyclerView.D(view4);
                    if (D8 != null) {
                        abstractC5032P.f40616b = new WeakReference(D8);
                    }
                    long nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                    C5023G a9 = ((C5024H) this.f24041g).a(0);
                    long j13 = a9.f40582c;
                    if (j13 != 0) {
                        nanoTime2 = (nanoTime2 / 4) + ((j13 / 4) * 3);
                    }
                    a9.f40582c = nanoTime2;
                    if (z8 && !c5029m.f40600g) {
                        i4 = abstractC5032P.f40623j;
                        if ((i4 & 8192) == 0 ? z9 : false) {
                            abstractC5032P.f40623j = i4 & (-8193);
                            if (c5029m.f40602j) {
                                AbstractC5063z.b(abstractC5032P);
                                AbstractC5063z abstractC5063z = recyclerView.f5372q0;
                                abstractC5032P.c();
                                abstractC5063z.getClass();
                                C0357t c0357t = new C0357t();
                                c0357t.a(abstractC5032P);
                                recyclerView.T(abstractC5032P, c0357t);
                            }
                        }
                    }
                    z10 = c5029m.f40600g;
                    view = abstractC5032P.f40615a;
                    if (z10 || !abstractC5032P.e()) {
                        if (abstractC5032P.e()) {
                            if (!((abstractC5032P.f40623j & 2) != 0 ? z9 : false)) {
                            }
                        }
                        z11 = false;
                        int m10 = recyclerView.f5380w.m(i, 0);
                        abstractC5032P.f40631r = recyclerView;
                        int i16 = abstractC5032P.f40620f;
                        long nanoTime3 = recyclerView.getNanoTime();
                        if (j9 != Long.MAX_VALUE) {
                            long j14 = ((C5024H) this.f24041g).a(i16).f40583d;
                            if (j14 != 0 && j14 + nanoTime3 >= j9) {
                                z13 = false;
                                z12 = z9;
                                layoutParams2 = view.getLayoutParams();
                                if (layoutParams2 != null) {
                                    c5020d = (C5020D) recyclerView.generateDefaultLayoutParams();
                                    view.setLayoutParams(c5020d);
                                } else if (recyclerView.checkLayoutParams(layoutParams2)) {
                                    c5020d = (C5020D) layoutParams2;
                                } else {
                                    c5020d = (C5020D) recyclerView.generateLayoutParams(layoutParams2);
                                    view.setLayoutParams(c5020d);
                                }
                                c5020d.f40576a = abstractC5032P;
                                c5020d.f40579d = (z8 || !z13) ? z11 : z12;
                                return abstractC5032P;
                            }
                        }
                        abstractC5059v = recyclerView.f5328D;
                        abstractC5059v.getClass();
                        abstractC5032P.f40617c = m10;
                        if (abstractC5059v.f40800b) {
                            abstractC5032P.f40619e = abstractC5059v.b(m10);
                        }
                        abstractC5032P.f40623j = (abstractC5032P.f40623j & (-520)) | 1;
                        int i17 = K.n.f1482a;
                        Trace.beginSection("RV OnBindView");
                        abstractC5032P.c();
                        abstractC5059v.c(abstractC5032P, m10);
                        arrayList = abstractC5032P.f40624k;
                        if (arrayList != null) {
                            arrayList.clear();
                        }
                        abstractC5032P.f40623j &= -1025;
                        layoutParams = view.getLayoutParams();
                        if (layoutParams instanceof C5020D) {
                            ((C5020D) layoutParams).f40578c = z9;
                        }
                        Trace.endSection();
                        long nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
                        C5023G a10 = ((C5024H) this.f24041g).a(abstractC5032P.f40620f);
                        j11 = a10.f40583d;
                        if (j11 != 0) {
                            nanoTime4 = (nanoTime4 / 4) + ((j11 / 4) * j10);
                        }
                        a10.f40583d = nanoTime4;
                        accessibilityManager = recyclerView.f5353Q;
                        if (accessibilityManager == null && accessibilityManager.isEnabled()) {
                            z12 = true;
                        } else {
                            WeakHashMap weakHashMap = O.X.f2240a;
                            z12 = true;
                            if (view.getImportantForAccessibility() == 0) {
                                view.setImportantForAccessibility(1);
                            }
                            C5033Q c5033q = recyclerView.f5352P0;
                            if (c5033q != null) {
                                a0.b bVar = c5033q.f40633e;
                                if (bVar != null) {
                                    View.AccessibilityDelegate d3 = O.X.d(view);
                                    C0336b c0336b2 = d3 == null ? c0336b : d3 instanceof C0334a ? ((C0334a) d3).f2246a : new C0336b(d3);
                                    if (c0336b2 != null && c0336b2 != bVar) {
                                        ((WeakHashMap) bVar.f4282f).put(view, c0336b2);
                                    }
                                }
                                O.X.o(view, bVar);
                            }
                        }
                        if (c5029m.f40600g) {
                            abstractC5032P.f40621g = i;
                        }
                        z13 = z12;
                        layoutParams2 = view.getLayoutParams();
                        if (layoutParams2 != null) {
                        }
                        c5020d.f40576a = abstractC5032P;
                        c5020d.f40579d = (z8 || !z13) ? z11 : z12;
                        return abstractC5032P;
                    }
                    abstractC5032P.f40621g = i;
                    z12 = z9;
                    z13 = false;
                    z11 = false;
                    layoutParams2 = view.getLayoutParams();
                    if (layoutParams2 != null) {
                    }
                    c5020d.f40576a = abstractC5032P;
                    c5020d.f40579d = (z8 || !z13) ? z11 : z12;
                    return abstractC5032P;
                } catch (Throwable th) {
                    int i18 = K.n.f1482a;
                    Trace.endSection();
                    throw th;
                }
            }
        } else {
            j10 = 3;
        }
        c0336b = null;
        if (z8) {
            i4 = abstractC5032P.f40623j;
            if ((i4 & 8192) == 0 ? z9 : false) {
            }
        }
        z10 = c5029m.f40600g;
        view = abstractC5032P.f40615a;
        if (z10) {
        }
        if (abstractC5032P.e()) {
        }
        z11 = false;
        int m102 = recyclerView.f5380w.m(i, 0);
        abstractC5032P.f40631r = recyclerView;
        int i162 = abstractC5032P.f40620f;
        long nanoTime32 = recyclerView.getNanoTime();
        if (j9 != Long.MAX_VALUE) {
        }
        abstractC5059v = recyclerView.f5328D;
        abstractC5059v.getClass();
        abstractC5032P.f40617c = m102;
        if (abstractC5059v.f40800b) {
        }
        abstractC5032P.f40623j = (abstractC5032P.f40623j & (-520)) | 1;
        int i172 = K.n.f1482a;
        Trace.beginSection("RV OnBindView");
        abstractC5032P.c();
        abstractC5059v.c(abstractC5032P, m102);
        arrayList = abstractC5032P.f40624k;
        if (arrayList != null) {
        }
        abstractC5032P.f40623j &= -1025;
        layoutParams = view.getLayoutParams();
        if (layoutParams instanceof C5020D) {
        }
        Trace.endSection();
        long nanoTime42 = recyclerView.getNanoTime() - nanoTime32;
        C5023G a102 = ((C5024H) this.f24041g).a(abstractC5032P.f40620f);
        j11 = a102.f40583d;
        if (j11 != 0) {
        }
        a102.f40583d = nanoTime42;
        accessibilityManager = recyclerView.f5353Q;
        if (accessibilityManager == null && accessibilityManager.isEnabled()) {
        }
        if (c5029m.f40600g) {
        }
        z13 = z12;
        layoutParams2 = view.getLayoutParams();
        if (layoutParams2 != null) {
        }
        c5020d.f40576a = abstractC5032P;
        c5020d.f40579d = (z8 || !z13) ? z11 : z12;
        return abstractC5032P;
    }

    public void j(AbstractC5032P abstractC5032P) {
        if (abstractC5032P.f40628o) {
            ((ArrayList) this.f24038d).remove(abstractC5032P);
        } else {
            ((ArrayList) this.f24037c).remove(abstractC5032P);
        }
        abstractC5032P.f40627n = null;
        abstractC5032P.f40628o = false;
        abstractC5032P.f40623j &= -33;
    }

    public void k() {
        AbstractC5019C abstractC5019C = ((RecyclerView) this.f24042h).f5330E;
        this.f24036b = this.f24035a + (abstractC5019C != null ? abstractC5019C.f40570j : 0);
        ArrayList arrayList = (ArrayList) this.f24039e;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f24036b; size--) {
            e(size);
        }
    }

    public /* synthetic */ BP m(C3366iP c3366iP) {
        return new BP((TP) this.f24037c, (TP) this.f24038d, this.f24035a, this.f24036b, c3366iP, (C3213fh) this.f24040f, (AbstractC3832r8) this.f24041g, this.f24042h);
    }

    public /* synthetic */ boolean n() {
        return Objects.equals(((TP) this.f24037c).f27776o, com.anythink.basead.exoplayer.k.o.f8622w);
    }
}
