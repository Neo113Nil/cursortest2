package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Arrays;
import kotlin.KotlinVersion;

/* renamed from: com.yandex.mobile.ads.impl.xg, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC2346xg {

    /* renamed from: a, reason: collision with root package name */
    public final int f34552a;

    /* renamed from: com.yandex.mobile.ads.impl.xg$a */
    static final class a extends AbstractC2346xg {

        /* renamed from: b, reason: collision with root package name */
        public final long f34553b;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f34554c;

        /* renamed from: d, reason: collision with root package name */
        public final ArrayList f34555d;

        public a(int i4, long j4) {
            super(i4);
            this.f34553b = j4;
            this.f34554c = new ArrayList();
            this.f34555d = new ArrayList();
        }

        public final a b(int i4) {
            int size = this.f34555d.size();
            for (int i5 = 0; i5 < size; i5++) {
                a aVar = (a) this.f34555d.get(i5);
                if (aVar.f34552a == i4) {
                    return aVar;
                }
            }
            return null;
        }

        public final b c(int i4) {
            int size = this.f34554c.size();
            for (int i5 = 0; i5 < size; i5++) {
                b bVar = (b) this.f34554c.get(i5);
                if (bVar.f34552a == i4) {
                    return bVar;
                }
            }
            return null;
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC2346xg
        public final String toString() {
            return AbstractC2346xg.a(this.f34552a) + " leaves: " + Arrays.toString(this.f34554c.toArray()) + " containers: " + Arrays.toString(this.f34555d.toArray());
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.xg$b */
    static final class b extends AbstractC2346xg {

        /* renamed from: b, reason: collision with root package name */
        public final sf1 f34556b;

        public b(int i4, sf1 sf1Var) {
            super(i4);
            this.f34556b = sf1Var;
        }
    }

    public AbstractC2346xg(int i4) {
        this.f34552a = i4;
    }

    public static String a(int i4) {
        return "" + ((char) ((i4 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE)) + ((char) ((i4 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE)) + ((char) ((i4 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE)) + ((char) (i4 & KotlinVersion.MAX_COMPONENT_VALUE));
    }

    public String toString() {
        return a(this.f34552a);
    }
}
