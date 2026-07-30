package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class J2 implements XA {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25715a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ J2 f25691b = new J2(1);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ J2 f25692c = new J2(2);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ J2 f25693d = new J2(3);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ J2 f25694e = new J2(4);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ J2 f25695f = new J2(5);

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ J2 f25696g = new J2(6);

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ J2 f25697h = new J2(7);
    public static final /* synthetic */ J2 i = new J2(8);

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ J2 f25698j = new J2(9);

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ J2 f25699k = new J2(10);

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ J2 f25700l = new J2(11);

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ J2 f25701m = new J2(12);

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ J2 f25702n = new J2(13);

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ J2 f25703o = new J2(14);

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ J2 f25704p = new J2(15);

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ J2 f25705q = new J2(17);

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ J2 f25706r = new J2(18);

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ J2 f25707s = new J2(19);

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ J2 f25708t = new J2(20);

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ J2 f25709u = new J2(21);

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ J2 f25710v = new J2(22);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ J2 f25711w = new J2(23);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ J2 f25712x = new J2(24);

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ J2 f25713y = new J2(25);

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ J2 f25714z = new J2(26);

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ J2 f25688A = new J2(27);

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ J2 f25689B = new J2(28);

    /* renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ J2 f25690C = new J2(29);

    public /* synthetic */ J2(int i4) {
        this.f25715a = i4;
    }

    @Override // com.google.android.gms.internal.ads.XA
    public final Object apply(Object obj) {
        switch (this.f25715a) {
            case 0:
                break;
            case 1:
                X2 x22 = (X2) obj;
                int i4 = S2.f27472G;
                break;
            case 2:
                Throwable th = (Throwable) obj;
                C2820Vb c2820Vb = AbstractC2935ac.f29210a;
                if (((Boolean) AbstractC2615Ja.i.r()).booleanValue()) {
                    p2.j.f39798C.f39808h.d("prepareClickUrl.attestation1", th);
                    break;
                }
                break;
            case 3:
                List list = C4072vf.f34819l;
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                FB fb = C2794Tj.f27817a;
                break;
            case 8:
                ArrayList arrayList = new ArrayList();
                for (BinderC3098db binderC3098db : (List) obj) {
                    if (binderC3098db != null) {
                        arrayList.add(binderC3098db);
                    }
                }
                break;
            case 9:
                ArrayList arrayList2 = new ArrayList();
                for (C3055cn c3055cn : (List) obj) {
                    if (c3055cn != null) {
                        arrayList2.add(c3055cn);
                    }
                }
                break;
            case 10:
                break;
            case 11:
                ArrayList arrayList3 = (ArrayList) obj;
                break;
            case 12:
                H2.b bVar = (H2.b) obj;
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                String str = ((C3008bu) obj).f29602b;
                if (TextUtils.isEmpty(str)) {
                    break;
                } else if (!u2.f.c()) {
                    break;
                }
                break;
            case 19:
                String str2 = ((C3008bu) obj).f29601a;
                if (TextUtils.isEmpty(str2)) {
                    break;
                } else if (!u2.f.c()) {
                    break;
                }
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                break;
            case 23:
                break;
            case 24:
                break;
            case 25:
                break;
            case 26:
                break;
            case 27:
                break;
            case 28:
                break;
            default:
                break;
        }
        return null;
    }
}
