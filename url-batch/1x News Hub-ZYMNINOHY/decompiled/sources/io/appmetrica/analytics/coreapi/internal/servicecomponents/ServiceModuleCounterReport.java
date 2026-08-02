package io.appmetrica.analytics.coreapi.internal.servicecomponents;

import java.util.Arrays;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.j;

/* loaded from: classes.dex */
public final class ServiceModuleCounterReport {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f5424a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5425b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f5426c;

    /* renamed from: d, reason: collision with root package name */
    private final int f5427d;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private String f5428a;

        /* renamed from: b, reason: collision with root package name */
        private String f5429b;

        /* renamed from: c, reason: collision with root package name */
        private byte[] f5430c;

        /* renamed from: d, reason: collision with root package name */
        private int f5431d;

        public final ServiceModuleCounterReport build() {
            return new ServiceModuleCounterReport(this.f5428a, this.f5429b, this.f5430c, this.f5431d);
        }

        public final Builder withName(String str) {
            this.f5428a = str;
            return this;
        }

        public final Builder withType(int i3) {
            this.f5431d = i3;
            return this;
        }

        public final Builder withValue(String str) {
            this.f5429b = str;
            return this;
        }

        public final Builder withValueBytes(byte[] bArr) {
            this.f5430c = bArr;
            return this;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final Builder newBuilder() {
            return new Builder();
        }

        private Companion() {
        }
    }

    public ServiceModuleCounterReport(String str, String str2, byte[] bArr, int i3) {
        this.f5424a = str;
        this.f5425b = str2;
        this.f5426c = bArr;
        this.f5427d = i3;
    }

    public static /* synthetic */ ServiceModuleCounterReport copy$default(ServiceModuleCounterReport serviceModuleCounterReport, String str, String str2, byte[] bArr, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = serviceModuleCounterReport.f5424a;
        }
        if ((i4 & 2) != 0) {
            str2 = serviceModuleCounterReport.f5425b;
        }
        if ((i4 & 4) != 0) {
            bArr = serviceModuleCounterReport.f5426c;
        }
        if ((i4 & 8) != 0) {
            i3 = serviceModuleCounterReport.f5427d;
        }
        return serviceModuleCounterReport.copy(str, str2, bArr, i3);
    }

    public final String component1() {
        return this.f5424a;
    }

    public final String component2() {
        return this.f5425b;
    }

    public final byte[] component3() {
        return this.f5426c;
    }

    public final int component4() {
        return this.f5427d;
    }

    public final ServiceModuleCounterReport copy(String str, String str2, byte[] bArr, int i3) {
        return new ServiceModuleCounterReport(str, str2, bArr, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceModuleCounterReport)) {
            return false;
        }
        ServiceModuleCounterReport serviceModuleCounterReport = (ServiceModuleCounterReport) obj;
        return this.f5427d == serviceModuleCounterReport.f5427d && j.a(this.f5424a, serviceModuleCounterReport.f5424a) && j.a(this.f5425b, serviceModuleCounterReport.f5425b) && Arrays.equals(this.f5426c, serviceModuleCounterReport.f5426c);
    }

    public final String getName() {
        return this.f5424a;
    }

    public final int getType() {
        return this.f5427d;
    }

    public final String getValue() {
        return this.f5425b;
    }

    public final byte[] getValueBytes() {
        return this.f5426c;
    }

    public int hashCode() {
        int i3 = this.f5427d * 31;
        String str = this.f5424a;
        int hashCode = (i3 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f5425b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        byte[] bArr = this.f5426c;
        return hashCode2 + (bArr != null ? Arrays.hashCode(bArr) : 0);
    }

    public String toString() {
        return "ServiceModuleCounterReport(name=" + this.f5424a + ", value=" + this.f5425b + ", valueBytes=" + Arrays.toString(this.f5426c) + ", type=" + this.f5427d + ')';
    }
}
