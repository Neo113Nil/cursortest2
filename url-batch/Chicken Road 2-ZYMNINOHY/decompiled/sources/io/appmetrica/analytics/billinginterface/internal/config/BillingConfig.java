package io.appmetrica.analytics.billinginterface.internal.config;

import E.AbstractC0005f;

/* loaded from: classes.dex */
public class BillingConfig {
    public final int firstCollectingInappMaxAgeSeconds;
    public final int sendFrequencySeconds;

    public BillingConfig(int i4, int i5) {
        this.sendFrequencySeconds = i4;
        this.firstCollectingInappMaxAgeSeconds = i5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BillingConfig billingConfig = (BillingConfig) obj;
        return this.sendFrequencySeconds == billingConfig.sendFrequencySeconds && this.firstCollectingInappMaxAgeSeconds == billingConfig.firstCollectingInappMaxAgeSeconds;
    }

    public int hashCode() {
        return (this.sendFrequencySeconds * 31) + this.firstCollectingInappMaxAgeSeconds;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BillingConfig{sendFrequencySeconds=");
        sb.append(this.sendFrequencySeconds);
        sb.append(", firstCollectingInappMaxAgeSeconds=");
        return AbstractC0005f.o(sb, this.firstCollectingInappMaxAgeSeconds, "}");
    }
}
