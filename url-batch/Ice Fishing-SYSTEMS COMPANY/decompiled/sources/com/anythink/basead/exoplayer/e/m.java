package com.anythink.basead.exoplayer.e;

import com.anythink.basead.exoplayer.k.s;
import java.util.Arrays;

/* loaded from: classes.dex */
public interface m {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f7340a;

        /* renamed from: b, reason: collision with root package name */
        public final byte[] f7341b;

        /* renamed from: c, reason: collision with root package name */
        public final int f7342c;

        /* renamed from: d, reason: collision with root package name */
        public final int f7343d;

        public a(int i, byte[] bArr, int i4, int i9) {
            this.f7340a = i;
            this.f7341b = bArr;
            this.f7342c = i4;
            this.f7343d = i9;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f7340a == aVar.f7340a && this.f7342c == aVar.f7342c && this.f7343d == aVar.f7343d && Arrays.equals(this.f7341b, aVar.f7341b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return ((((Arrays.hashCode(this.f7341b) + (this.f7340a * 31)) * 31) + this.f7342c) * 31) + this.f7343d;
        }
    }

    int a(f fVar, int i, boolean z8);

    void a(long j9, int i, int i4, int i9, a aVar);

    void a(s sVar, int i);

    void a(com.anythink.basead.exoplayer.m mVar);
}
