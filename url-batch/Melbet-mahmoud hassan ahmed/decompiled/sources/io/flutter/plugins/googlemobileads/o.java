package io.flutter.plugins.googlemobileads;

import x2.a;

/* loaded from: classes.dex */
class o {

    /* renamed from: a, reason: collision with root package name */
    final b f17550a;

    /* renamed from: b, reason: collision with root package name */
    final String f17551b;

    /* renamed from: c, reason: collision with root package name */
    final Number f17552c;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f17553a;

        static {
            int[] iArr = new int[a.EnumC0152a.values().length];
            f17553a = iArr;
            try {
                iArr[a.EnumC0152a.NOT_READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17553a[a.EnumC0152a.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    enum b {
        NOT_READY,
        READY
    }

    o(b bVar, String str, Number number) {
        this.f17550a = bVar;
        this.f17551b = str;
        this.f17552c = number;
    }

    o(x2.a aVar) {
        b bVar;
        int i7 = a.f17553a[aVar.a().ordinal()];
        if (i7 == 1) {
            bVar = b.NOT_READY;
        } else {
            if (i7 != 2) {
                throw new IllegalArgumentException(String.format("Unable to handle state: %s", aVar.a()));
            }
            bVar = b.READY;
        }
        this.f17550a = bVar;
        this.f17551b = aVar.getDescription();
        this.f17552c = Integer.valueOf(aVar.b());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f17550a == oVar.f17550a && this.f17551b.equals(oVar.f17551b)) {
            return this.f17552c.equals(oVar.f17552c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f17550a.hashCode() * 31) + this.f17551b.hashCode()) * 31) + this.f17552c.hashCode();
    }
}
