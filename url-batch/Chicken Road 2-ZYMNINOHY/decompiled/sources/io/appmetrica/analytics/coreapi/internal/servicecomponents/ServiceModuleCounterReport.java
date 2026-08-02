package io.appmetrica.analytics.coreapi.internal.servicecomponents;

import java.util.Arrays;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class ServiceModuleCounterReport {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f9678a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9679b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f9680c;

    /* renamed from: d, reason: collision with root package name */
    private final int f9681d;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private String f9682a;

        /* renamed from: b, reason: collision with root package name */
        private String f9683b;

        /* renamed from: c, reason: collision with root package name */
        private byte[] f9684c;

        /* renamed from: d, reason: collision with root package name */
        private int f9685d;

        public final ServiceModuleCounterReport build() {
            return new ServiceModuleCounterReport(this.f9682a, this.f9683b, this.f9684c, this.f9685d);
        }

        public final Builder withName(String str) {
            this.f9682a = str;
            return this;
        }

        public final Builder withType(int i4) {
            this.f9685d = i4;
            return this;
        }

        public final Builder withValue(String str) {
            this.f9683b = str;
            return this;
        }

        public final Builder withValueBytes(byte[] bArr) {
            this.f9684c = bArr;
            return this;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final Builder newBuilder() {
            return new Builder();
        }

        private Companion() {
        }
    }

    public ServiceModuleCounterReport(String str, String str2, byte[] bArr, int i4) {
        this.f9678a = str;
        this.f9679b = str2;
        this.f9680c = bArr;
        this.f9681d = i4;
    }

    public static /* synthetic */ ServiceModuleCounterReport copy$default(ServiceModuleCounterReport serviceModuleCounterReport, String str, String str2, byte[] bArr, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = serviceModuleCounterReport.f9678a;
        }
        if ((i5 & 2) != 0) {
            str2 = serviceModuleCounterReport.f9679b;
        }
        if ((i5 & 4) != 0) {
            bArr = serviceModuleCounterReport.f9680c;
        }
        if ((i5 & 8) != 0) {
            i4 = serviceModuleCounterReport.f9681d;
        }
        return serviceModuleCounterReport.copy(str, str2, bArr, i4);
    }

    public final String component1() {
        return this.f9678a;
    }

    public final String component2() {
        return this.f9679b;
    }

    public final byte[] component3() {
        return this.f9680c;
    }

    public final int component4() {
        return this.f9681d;
    }

    public final ServiceModuleCounterReport copy(String str, String str2, byte[] bArr, int i4) {
        return new ServiceModuleCounterReport(str, str2, bArr, i4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceModuleCounterReport)) {
            return false;
        }
        ServiceModuleCounterReport serviceModuleCounterReport = (ServiceModuleCounterReport) obj;
        return this.f9681d == serviceModuleCounterReport.f9681d && i.a(this.f9678a, serviceModuleCounterReport.f9678a) && i.a(this.f9679b, serviceModuleCounterReport.f9679b) && Arrays.equals(this.f9680c, serviceModuleCounterReport.f9680c);
    }

    public final String getName() {
        return this.f9678a;
    }

    public final int getType() {
        return this.f9681d;
    }

    public final String getValue() {
        return this.f9679b;
    }

    public final byte[] getValueBytes() {
        return this.f9680c;
    }

    public int hashCode() {
        int i4 = this.f9681d * 31;
        String str = this.f9678a;
        int hashCode = (i4 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f9679b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        byte[] bArr = this.f9680c;
        return hashCode2 + (bArr != null ? Arrays.hashCode(bArr) : 0);
    }

    public String toString() {
        return "ServiceModuleCounterReport(name=" + this.f9678a + ", value=" + this.f9679b + ", valueBytes=" + Arrays.toString(this.f9680c) + ", type=" + this.f9681d + ')';
    }
}
