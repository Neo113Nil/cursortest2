package D0;

import B1.j;
import S0.s;
import S0.x;
import S1.h;
import T.C0099q;
import T.L;
import V.f;
import V.g;
import W.D;
import W.InterfaceC0118k;
import a.AbstractC0124a;
import a0.C0146l;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.Base64;
import android.view.View;
import io.appmetrica.analytics.impl.C0583e9;
import io.flutter.Build;
import io.flutter.util.ViewUtils;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import y0.n;
import y0.q;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements q, u2.d, h, InterfaceC0118k, ViewUtils.ViewVisitor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f339a;

    public /* synthetic */ d(int i4) {
        this.f339a = i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0326  */
    /* JADX WARN: Type inference failed for: r2v34, types: [android.text.Spannable, android.text.SpannableString] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    @Override // u2.d, S1.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object apply(Object obj) {
        CharSequence charSequence;
        Bitmap bitmap;
        String str;
        float f4;
        int i4;
        String str2;
        float f5;
        int i5;
        String str3;
        int i6;
        int i7 = 2;
        boolean z = true;
        switch (this.f339a) {
            case 8:
                return (x) obj;
            case 9:
            case 12:
            default:
                return new b0.d((D) obj);
            case 10:
                Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
                try {
                    Cursor cursor = rawQuery;
                    ArrayList arrayList = new ArrayList();
                    while (cursor.moveToNext()) {
                        j a3 = L1.j.a();
                        a3.D(cursor.getString(1));
                        a3.f203d = V1.a.b(cursor.getInt(2));
                        String string = cursor.getString(3);
                        a3.f202c = string == null ? null : Base64.decode(string, 0);
                        arrayList.add(a3.h());
                    }
                    return arrayList;
                } finally {
                    rawQuery.close();
                }
            case 11:
                C0099q c0099q = (C0099q) obj;
                return c0099q.f2879a + ": " + c0099q.f2880b;
            case 13:
                return Integer.valueOf(((V.b) obj).f3162r);
            case 14:
                Bundle bundle = (Bundle) obj;
                ?? charSequence2 = bundle.getCharSequence(V.b.f3141s);
                if (charSequence2 != 0) {
                    ArrayList parcelableArrayList = bundle.getParcelableArrayList(V.b.f3142t);
                    if (parcelableArrayList != null) {
                        charSequence2 = SpannableString.valueOf(charSequence2);
                        int size = parcelableArrayList.size();
                        int i8 = 0;
                        while (i8 < size) {
                            Object obj2 = parcelableArrayList.get(i8);
                            i8++;
                            Bundle bundle2 = (Bundle) obj2;
                            int i9 = bundle2.getInt(V.d.f3165a);
                            int i10 = bundle2.getInt(V.d.f3166b);
                            int i11 = bundle2.getInt(V.d.f3167c);
                            int i12 = bundle2.getInt(V.d.f3168d, -1);
                            Bundle bundle3 = bundle2.getBundle(V.d.f3169e);
                            if (i12 == 1) {
                                bundle3.getClass();
                                String string2 = bundle3.getString(f.f3170c);
                                string2.getClass();
                                charSequence2.setSpan(new f(string2, bundle3.getInt(f.f3171d)), i9, i10, i11);
                            } else if (i12 == i7) {
                                bundle3.getClass();
                                charSequence2.setSpan(new g(bundle3.getInt(g.f3174d), bundle3.getInt(g.f3175e), bundle3.getInt(g.f3176f)), i9, i10, i11);
                            } else if (i12 == 3) {
                                charSequence2.setSpan(new V.e(), i9, i10, i11);
                            } else if (i12 == 4) {
                                bundle3.getClass();
                                String string3 = bundle3.getString(V.h.f3180b);
                                string3.getClass();
                                charSequence2.setSpan(new V.h(string3), i9, i10, i11);
                            }
                            i7 = 2;
                        }
                    }
                } else {
                    charSequence2 = 0;
                }
                Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(V.b.f3143u);
                Layout.Alignment alignment2 = alignment != null ? alignment : null;
                Layout.Alignment alignment3 = (Layout.Alignment) bundle.getSerializable(V.b.v);
                Layout.Alignment alignment4 = alignment3 != null ? alignment3 : null;
                Bitmap bitmap2 = (Bitmap) bundle.getParcelable(V.b.f3144w);
                if (bitmap2 != null) {
                    bitmap = bitmap2;
                } else {
                    byte[] byteArray = bundle.getByteArray(V.b.f3145x);
                    if (byteArray == null) {
                        charSequence = charSequence2;
                        bitmap = null;
                        str = V.b.f3146y;
                        if (bundle.containsKey(str)) {
                            String str4 = V.b.z;
                            if (bundle.containsKey(str4)) {
                                f4 = bundle.getFloat(str);
                                i4 = bundle.getInt(str4);
                                String str5 = V.b.f3130A;
                                int i13 = bundle.containsKey(str5) ? bundle.getInt(str5) : Integer.MIN_VALUE;
                                String str6 = V.b.f3131B;
                                float f6 = bundle.containsKey(str6) ? bundle.getFloat(str6) : -3.4028235E38f;
                                String str7 = V.b.f3132C;
                                int i14 = bundle.containsKey(str7) ? bundle.getInt(str7) : Integer.MIN_VALUE;
                                str2 = V.b.f3134E;
                                if (bundle.containsKey(str2)) {
                                    String str8 = V.b.f3133D;
                                    if (bundle.containsKey(str8)) {
                                        f5 = bundle.getFloat(str2);
                                        i5 = bundle.getInt(str8);
                                        String str9 = V.b.f3135F;
                                        float f7 = !bundle.containsKey(str9) ? bundle.getFloat(str9) : -3.4028235E38f;
                                        String str10 = V.b.f3136G;
                                        float f8 = bundle.containsKey(str10) ? bundle.getFloat(str10) : -3.4028235E38f;
                                        str3 = V.b.f3137H;
                                        if (bundle.containsKey(str3)) {
                                            i6 = -16777216;
                                            z = false;
                                        } else {
                                            i6 = bundle.getInt(str3);
                                        }
                                        int i15 = i6;
                                        boolean z4 = bundle.getBoolean(V.b.f3138I, false) ? false : z;
                                        String str11 = V.b.f3139J;
                                        int i16 = bundle.containsKey(str11) ? bundle.getInt(str11) : Integer.MIN_VALUE;
                                        String str12 = V.b.f3140K;
                                        float f9 = !bundle.containsKey(str12) ? bundle.getFloat(str12) : 0.0f;
                                        String str13 = V.b.L;
                                        return new V.b(charSequence, alignment2, alignment4, bitmap, f4, i4, i13, f6, i14, i5, f5, f7, f8, z4, i15, i16, f9, bundle.containsKey(str13) ? bundle.getInt(str13) : 0);
                                    }
                                }
                                f5 = -3.4028235E38f;
                                i5 = Integer.MIN_VALUE;
                                String str92 = V.b.f3135F;
                                if (!bundle.containsKey(str92)) {
                                }
                                String str102 = V.b.f3136G;
                                float f82 = bundle.containsKey(str102) ? bundle.getFloat(str102) : -3.4028235E38f;
                                str3 = V.b.f3137H;
                                if (bundle.containsKey(str3)) {
                                }
                                int i152 = i6;
                                if (bundle.getBoolean(V.b.f3138I, false)) {
                                }
                                String str112 = V.b.f3139J;
                                int i162 = bundle.containsKey(str112) ? bundle.getInt(str112) : Integer.MIN_VALUE;
                                String str122 = V.b.f3140K;
                                float f92 = !bundle.containsKey(str122) ? bundle.getFloat(str122) : 0.0f;
                                String str132 = V.b.L;
                                return new V.b(charSequence, alignment2, alignment4, bitmap, f4, i4, i13, f6, i14, i5, f5, f7, f82, z4, i152, i162, f92, bundle.containsKey(str132) ? bundle.getInt(str132) : 0);
                            }
                        }
                        f4 = -3.4028235E38f;
                        i4 = Integer.MIN_VALUE;
                        String str52 = V.b.f3130A;
                        if (bundle.containsKey(str52)) {
                        }
                        String str62 = V.b.f3131B;
                        if (bundle.containsKey(str62)) {
                        }
                        String str72 = V.b.f3132C;
                        if (bundle.containsKey(str72)) {
                        }
                        str2 = V.b.f3134E;
                        if (bundle.containsKey(str2)) {
                        }
                        f5 = -3.4028235E38f;
                        i5 = Integer.MIN_VALUE;
                        String str922 = V.b.f3135F;
                        if (!bundle.containsKey(str922)) {
                        }
                        String str1022 = V.b.f3136G;
                        float f822 = bundle.containsKey(str1022) ? bundle.getFloat(str1022) : -3.4028235E38f;
                        str3 = V.b.f3137H;
                        if (bundle.containsKey(str3)) {
                        }
                        int i1522 = i6;
                        if (bundle.getBoolean(V.b.f3138I, false)) {
                        }
                        String str1122 = V.b.f3139J;
                        int i1622 = bundle.containsKey(str1122) ? bundle.getInt(str1122) : Integer.MIN_VALUE;
                        String str1222 = V.b.f3140K;
                        float f922 = !bundle.containsKey(str1222) ? bundle.getFloat(str1222) : 0.0f;
                        String str1322 = V.b.L;
                        return new V.b(charSequence, alignment2, alignment4, bitmap, f4, i4, i13, f6, i14, i5, f5, f7, f822, z4, i1522, i1622, f922, bundle.containsKey(str1322) ? bundle.getInt(str1322) : 0);
                    }
                    bitmap = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
                }
                charSequence = null;
                str = V.b.f3146y;
                if (bundle.containsKey(str)) {
                }
                f4 = -3.4028235E38f;
                i4 = Integer.MIN_VALUE;
                String str522 = V.b.f3130A;
                if (bundle.containsKey(str522)) {
                }
                String str622 = V.b.f3131B;
                if (bundle.containsKey(str622)) {
                }
                String str722 = V.b.f3132C;
                if (bundle.containsKey(str722)) {
                }
                str2 = V.b.f3134E;
                if (bundle.containsKey(str2)) {
                }
                f5 = -3.4028235E38f;
                i5 = Integer.MIN_VALUE;
                String str9222 = V.b.f3135F;
                if (!bundle.containsKey(str9222)) {
                }
                String str10222 = V.b.f3136G;
                float f8222 = bundle.containsKey(str10222) ? bundle.getFloat(str10222) : -3.4028235E38f;
                str3 = V.b.f3137H;
                if (bundle.containsKey(str3)) {
                }
                int i15222 = i6;
                if (bundle.getBoolean(V.b.f3138I, false)) {
                }
                String str11222 = V.b.f3139J;
                int i16222 = bundle.containsKey(str11222) ? bundle.getInt(str11222) : Integer.MIN_VALUE;
                String str12222 = V.b.f3140K;
                float f9222 = !bundle.containsKey(str12222) ? bundle.getFloat(str12222) : 0.0f;
                String str13222 = V.b.L;
                return new V.b(charSequence, alignment2, alignment4, bitmap, f4, i4, i13, f6, i14, i5, f5, f7, f8222, z4, i15222, i16222, f9222, bundle.containsKey(str13222) ? bundle.getInt(str13222) : 0);
            case 15:
                V.b bVar = (V.b) obj;
                Bitmap bitmap3 = bVar.f3150d;
                Bundle bundle4 = new Bundle();
                CharSequence charSequence3 = bVar.f3147a;
                if (charSequence3 != null) {
                    bundle4.putCharSequence(V.b.f3141s, charSequence3);
                    if (charSequence3 instanceof Spanned) {
                        Spanned spanned = (Spanned) charSequence3;
                        String str14 = V.d.f3165a;
                        ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                        for (f fVar : (f[]) spanned.getSpans(0, spanned.length(), f.class)) {
                            fVar.getClass();
                            Bundle bundle5 = new Bundle();
                            bundle5.putString(f.f3170c, fVar.f3172a);
                            bundle5.putInt(f.f3171d, fVar.f3173b);
                            arrayList2.add(V.d.a(spanned, fVar, 1, bundle5));
                        }
                        for (g gVar : (g[]) spanned.getSpans(0, spanned.length(), g.class)) {
                            gVar.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt(g.f3174d, gVar.f3177a);
                            bundle6.putInt(g.f3175e, gVar.f3178b);
                            bundle6.putInt(g.f3176f, gVar.f3179c);
                            arrayList2.add(V.d.a(spanned, gVar, 2, bundle6));
                        }
                        for (V.e eVar : (V.e[]) spanned.getSpans(0, spanned.length(), V.e.class)) {
                            arrayList2.add(V.d.a(spanned, eVar, 3, null));
                        }
                        for (V.h hVar : (V.h[]) spanned.getSpans(0, spanned.length(), V.h.class)) {
                            hVar.getClass();
                            Bundle bundle7 = new Bundle();
                            bundle7.putString(V.h.f3180b, hVar.f3181a);
                            arrayList2.add(V.d.a(spanned, hVar, 4, bundle7));
                        }
                        if (!arrayList2.isEmpty()) {
                            bundle4.putParcelableArrayList(V.b.f3142t, arrayList2);
                        }
                    }
                }
                bundle4.putSerializable(V.b.f3143u, bVar.f3148b);
                bundle4.putSerializable(V.b.v, bVar.f3149c);
                bundle4.putFloat(V.b.f3146y, bVar.f3151e);
                bundle4.putInt(V.b.z, bVar.f3152f);
                bundle4.putInt(V.b.f3130A, bVar.f3153g);
                bundle4.putFloat(V.b.f3131B, bVar.f3154h);
                bundle4.putInt(V.b.f3132C, bVar.f3155i);
                bundle4.putInt(V.b.f3133D, bVar.n);
                bundle4.putFloat(V.b.f3134E, bVar.o);
                bundle4.putFloat(V.b.f3135F, bVar.f3156j);
                bundle4.putFloat(V.b.f3136G, bVar.f3157k);
                bundle4.putBoolean(V.b.f3138I, bVar.f3158l);
                bundle4.putInt(V.b.f3137H, bVar.f3159m);
                bundle4.putInt(V.b.f3139J, bVar.f3160p);
                bundle4.putFloat(V.b.f3140K, bVar.f3161q);
                bundle4.putInt(V.b.L, bVar.f3162r);
                if (bitmap3 != null) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    AbstractC0124a.t(bitmap3.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
                    bundle4.putByteArray(V.b.f3145x, byteArrayOutputStream.toByteArray());
                }
                return bundle4;
            case 16:
                long j4 = ((V0.a) obj).f3183b;
                if (j4 == -9223372036854775807L) {
                    j4 = 0;
                }
                return Long.valueOf(j4);
        }
    }

    @Override // y0.q
    public n[] b() {
        switch (this.f339a) {
            case 0:
                return new n[]{new e()};
            case 3:
                return new n[]{new E0.b()};
            case 9:
                return new n[]{new s(V0.j.f3206v0, 16)};
            default:
                return new n[]{new T0.d()};
        }
    }

    @Override // W.InterfaceC0118k
    public void invoke(Object obj) {
        switch (this.f339a) {
            case 18:
                ((L) obj).onPlayerError(new C0146l(2, new G1.a("Player release timed out."), 1003));
                break;
            case C0583e9.f11743C /* 19 */:
                ((L) obj).onRenderedFirstFrame();
                break;
            case C0583e9.f11744D /* 20 */:
            default:
                ((b0.h) obj).getClass();
                break;
            case 21:
                ((b0.h) obj).getClass();
                break;
            case Build.API_LEVELS.API_22 /* 22 */:
                ((b0.h) obj).getClass();
                break;
            case Build.API_LEVELS.API_23 /* 23 */:
                ((b0.h) obj).getClass();
                break;
            case 24:
                ((b0.h) obj).getClass();
                break;
            case 25:
                ((b0.h) obj).getClass();
                break;
            case 26:
                ((b0.h) obj).getClass();
                break;
            case 27:
                ((b0.h) obj).getClass();
                break;
            case Build.API_LEVELS.API_28 /* 28 */:
                ((b0.h) obj).getClass();
                break;
        }
    }

    @Override // io.flutter.util.ViewUtils.ViewVisitor
    public boolean run(View view) {
        return view.hasFocus();
    }
}
