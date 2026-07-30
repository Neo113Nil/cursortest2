package com.chicken.road.whale.plate;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import n7.b;
import o7.a1;
import o7.w0;
import r6.e;
import r6.k;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class PlateReply {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    private final String time;
    private final String url;

    /* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
    public static final class Companion {
        public final KSerializer serializer() {
            return PlateReply$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PlateReply() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (e) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ PlateReply copy$default(PlateReply plateReply, String str, String str2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = plateReply.url;
        }
        if ((i7 & 2) != 0) {
            str2 = plateReply.time;
        }
        return plateReply.copy(str, str2);
    }

    public static final void write$Self$app_release(PlateReply plateReply, b bVar, SerialDescriptor serialDescriptor) {
        r4.a aVar = (r4.a) bVar;
        aVar.getClass();
        k.f(serialDescriptor, "descriptor");
        a1 a1Var = a1.f6856a;
        aVar.B(serialDescriptor, 0, plateReply.url);
        aVar.B(serialDescriptor, 1, plateReply.time);
    }

    public final String component1() {
        return this.url;
    }

    public final String component2() {
        return this.time;
    }

    public final PlateReply copy(String str, String str2) {
        return new PlateReply(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlateReply)) {
            return false;
        }
        PlateReply plateReply = (PlateReply) obj;
        return k.a(this.url, plateReply.url) && k.a(this.time, plateReply.time);
    }

    public final String getTime() {
        return this.time;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.url;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.time;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "PlateReply(url=" + this.url + ", time=" + this.time + ")";
    }

    public PlateReply(int i7, String str, String str2, w0 w0Var) {
        if ((i7 & 1) == 0) {
            this.url = null;
        } else {
            this.url = str;
        }
        if ((i7 & 2) == 0) {
            this.time = null;
        } else {
            this.time = str2;
        }
    }

    public PlateReply(String str, String str2) {
        this.url = str;
        this.time = str2;
    }

    public /* synthetic */ PlateReply(String str, String str2, int i7, e eVar) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2);
    }
}
