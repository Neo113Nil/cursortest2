package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.os.Bundle;
import com.yandex.mobile.ads.impl.C2265u4;
import com.yandex.mobile.ads.impl.InterfaceC2259tl;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.yandex.mobile.ads.impl.u4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2265u4 implements InterfaceC2259tl {

    /* renamed from: h, reason: collision with root package name */
    public static final C2265u4 f32818h = new C2265u4(null, new a[0], 0, -9223372036854775807L, 0);

    /* renamed from: i, reason: collision with root package name */
    private static final a f32819i = new a(0, -1, new int[0], new Uri[0], new long[0], 0, false).a();

    /* renamed from: j, reason: collision with root package name */
    public static final InterfaceC2259tl.a<C2265u4> f32820j = new InterfaceC2259tl.a() { // from class: com.yandex.mobile.ads.impl.Wg
        @Override // com.yandex.mobile.ads.impl.InterfaceC2259tl.a
        public final InterfaceC2259tl fromBundle(Bundle bundle) {
            C2265u4 a4;
            a4 = C2265u4.a(bundle);
            return a4;
        }
    };

    /* renamed from: b, reason: collision with root package name */
    public final Object f32821b;

    /* renamed from: c, reason: collision with root package name */
    public final int f32822c;

    /* renamed from: d, reason: collision with root package name */
    public final long f32823d;

    /* renamed from: e, reason: collision with root package name */
    public final long f32824e;

    /* renamed from: f, reason: collision with root package name */
    public final int f32825f;

    /* renamed from: g, reason: collision with root package name */
    private final a[] f32826g;

    /* renamed from: com.yandex.mobile.ads.impl.u4$a */
    public static final class a implements InterfaceC2259tl {

        /* renamed from: i, reason: collision with root package name */
        public static final InterfaceC2259tl.a<a> f32827i = new InterfaceC2259tl.a() { // from class: com.yandex.mobile.ads.impl.Xg
            @Override // com.yandex.mobile.ads.impl.InterfaceC2259tl.a
            public final InterfaceC2259tl fromBundle(Bundle bundle) {
                C2265u4.a a4;
                a4 = C2265u4.a.a(bundle);
                return a4;
            }
        };

        /* renamed from: b, reason: collision with root package name */
        public final long f32828b;

        /* renamed from: c, reason: collision with root package name */
        public final int f32829c;

        /* renamed from: d, reason: collision with root package name */
        public final Uri[] f32830d;

        /* renamed from: e, reason: collision with root package name */
        public final int[] f32831e;

        /* renamed from: f, reason: collision with root package name */
        public final long[] f32832f;

        /* renamed from: g, reason: collision with root package name */
        public final long f32833g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f32834h;

        /* JADX INFO: Access modifiers changed from: private */
        public static a a(Bundle bundle) {
            long j4 = bundle.getLong(Integer.toString(0, 36));
            int i4 = bundle.getInt(Integer.toString(1, 36), -1);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(2, 36));
            int[] intArray = bundle.getIntArray(Integer.toString(3, 36));
            long[] longArray = bundle.getLongArray(Integer.toString(4, 36));
            long j5 = bundle.getLong(Integer.toString(5, 36));
            boolean z4 = bundle.getBoolean(Integer.toString(6, 36));
            int[] iArr = intArray;
            if (iArr == null) {
                iArr = new int[0];
            }
            Uri[] uriArr = parcelableArrayList == null ? new Uri[0] : (Uri[]) parcelableArrayList.toArray(new Uri[0]);
            if (longArray == null) {
                longArray = new long[0];
            }
            return new a(j4, i4, iArr, uriArr, longArray, j5, z4);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f32828b == aVar.f32828b && this.f32829c == aVar.f32829c && Arrays.equals(this.f32830d, aVar.f32830d) && Arrays.equals(this.f32831e, aVar.f32831e) && Arrays.equals(this.f32832f, aVar.f32832f) && this.f32833g == aVar.f32833g && this.f32834h == aVar.f32834h) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            int i4 = this.f32829c * 31;
            long j4 = this.f32828b;
            int hashCode = (Arrays.hashCode(this.f32832f) + ((Arrays.hashCode(this.f32831e) + ((((i4 + ((int) (j4 ^ (j4 >>> 32)))) * 31) + Arrays.hashCode(this.f32830d)) * 31)) * 31)) * 31;
            long j5 = this.f32833g;
            return ((hashCode + ((int) (j5 ^ (j5 >>> 32)))) * 31) + (this.f32834h ? 1 : 0);
        }

        private a(long j4, int i4, int[] iArr, Uri[] uriArr, long[] jArr, long j5, boolean z4) {
            C2253tf.a(iArr.length == uriArr.length);
            this.f32828b = j4;
            this.f32829c = i4;
            this.f32831e = iArr;
            this.f32830d = uriArr;
            this.f32832f = jArr;
            this.f32833g = j5;
            this.f32834h = z4;
        }

        public final int a(int i4) {
            int i5;
            int i6 = i4 + 1;
            while (true) {
                int[] iArr = this.f32831e;
                if (i6 >= iArr.length || this.f32834h || (i5 = iArr[i6]) == 0 || i5 == 1) {
                    break;
                }
                i6++;
            }
            return i6;
        }

        public final a a() {
            int[] iArr = this.f32831e;
            int length = iArr.length;
            int max = Math.max(0, length);
            int[] copyOf = Arrays.copyOf(iArr, max);
            Arrays.fill(copyOf, length, max, 0);
            long[] jArr = this.f32832f;
            int length2 = jArr.length;
            int max2 = Math.max(0, length2);
            long[] copyOf2 = Arrays.copyOf(jArr, max2);
            Arrays.fill(copyOf2, length2, max2, -9223372036854775807L);
            return new a(this.f32828b, 0, copyOf, (Uri[]) Arrays.copyOf(this.f32830d, 0), copyOf2, this.f32833g, this.f32834h);
        }
    }

    private C2265u4(Object obj, a[] aVarArr, long j4, long j5, int i4) {
        this.f32821b = obj;
        this.f32823d = j4;
        this.f32824e = j5;
        this.f32822c = aVarArr.length + i4;
        this.f32826g = aVarArr;
        this.f32825f = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static C2265u4 a(Bundle bundle) {
        a[] aVarArr;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(1, 36));
        if (parcelableArrayList == null) {
            aVarArr = new a[0];
        } else {
            a[] aVarArr2 = new a[parcelableArrayList.size()];
            for (int i4 = 0; i4 < parcelableArrayList.size(); i4++) {
                aVarArr2[i4] = a.f32827i.fromBundle((Bundle) parcelableArrayList.get(i4));
            }
            aVarArr = aVarArr2;
        }
        return new C2265u4(null, aVarArr, bundle.getLong(Integer.toString(2, 36), 0L), bundle.getLong(Integer.toString(3, 36), -9223372036854775807L), bundle.getInt(Integer.toString(4, 36)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2265u4.class == obj.getClass()) {
            C2265u4 c2265u4 = (C2265u4) obj;
            if (u82.a(this.f32821b, c2265u4.f32821b) && this.f32822c == c2265u4.f32822c && this.f32823d == c2265u4.f32823d && this.f32824e == c2265u4.f32824e && this.f32825f == c2265u4.f32825f && Arrays.equals(this.f32826g, c2265u4.f32826g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i4 = this.f32822c * 31;
        Object obj = this.f32821b;
        return ((((((((i4 + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f32823d)) * 31) + ((int) this.f32824e)) * 31) + this.f32825f) * 31) + Arrays.hashCode(this.f32826g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=");
        sb.append(this.f32821b);
        sb.append(", adResumePositionUs=");
        sb.append(this.f32823d);
        sb.append(", adGroups=[");
        for (int i4 = 0; i4 < this.f32826g.length; i4++) {
            sb.append("adGroup(timeUs=");
            sb.append(this.f32826g[i4].f32828b);
            sb.append(", ads=[");
            for (int i5 = 0; i5 < this.f32826g[i4].f32831e.length; i5++) {
                sb.append("ad(state=");
                int i6 = this.f32826g[i4].f32831e[i5];
                if (i6 == 0) {
                    sb.append('_');
                } else if (i6 == 1) {
                    sb.append('R');
                } else if (i6 == 2) {
                    sb.append('S');
                } else if (i6 == 3) {
                    sb.append('P');
                } else if (i6 != 4) {
                    sb.append('?');
                } else {
                    sb.append('!');
                }
                sb.append(", durationUs=");
                sb.append(this.f32826g[i4].f32832f[i5]);
                sb.append(')');
                if (i5 < this.f32826g[i4].f32831e.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i4 < this.f32826g.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("])");
        return sb.toString();
    }

    public final a a(int i4) {
        int i5 = this.f32825f;
        if (i4 < i5) {
            return f32819i;
        }
        return this.f32826g[i4 - i5];
    }
}
