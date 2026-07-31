package io.opentelemetry.sdk.metrics;

import javax.annotation.Nullable;

/* loaded from: classes3.dex */
final class AutoValue_InstrumentSelector extends InstrumentSelector {

    @Nullable
    private final String instrumentName;

    @Nullable
    private final InstrumentType instrumentType;

    @Nullable
    private final String instrumentUnit;

    @Nullable
    private final String meterName;

    @Nullable
    private final String meterSchemaUrl;

    @Nullable
    private final String meterVersion;

    AutoValue_InstrumentSelector(@Nullable InstrumentType instrumentType, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.instrumentType = instrumentType;
        this.instrumentName = str;
        this.instrumentUnit = str2;
        this.meterName = str3;
        this.meterVersion = str4;
        this.meterSchemaUrl = str5;
    }

    @Override // io.opentelemetry.sdk.metrics.InstrumentSelector
    @Nullable
    public InstrumentType getInstrumentType() {
        return this.instrumentType;
    }

    @Override // io.opentelemetry.sdk.metrics.InstrumentSelector
    @Nullable
    public String getInstrumentName() {
        return this.instrumentName;
    }

    @Override // io.opentelemetry.sdk.metrics.InstrumentSelector
    @Nullable
    public String getInstrumentUnit() {
        return this.instrumentUnit;
    }

    @Override // io.opentelemetry.sdk.metrics.InstrumentSelector
    @Nullable
    public String getMeterName() {
        return this.meterName;
    }

    @Override // io.opentelemetry.sdk.metrics.InstrumentSelector
    @Nullable
    public String getMeterVersion() {
        return this.meterVersion;
    }

    @Override // io.opentelemetry.sdk.metrics.InstrumentSelector
    @Nullable
    public String getMeterSchemaUrl() {
        return this.meterSchemaUrl;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InstrumentSelector) {
            InstrumentSelector instrumentSelector = (InstrumentSelector) obj;
            InstrumentType instrumentType = this.instrumentType;
            if (instrumentType != null ? instrumentType.equals(instrumentSelector.getInstrumentType()) : instrumentSelector.getInstrumentType() == null) {
                String str = this.instrumentName;
                if (str != null ? str.equals(instrumentSelector.getInstrumentName()) : instrumentSelector.getInstrumentName() == null) {
                    String str2 = this.instrumentUnit;
                    if (str2 != null ? str2.equals(instrumentSelector.getInstrumentUnit()) : instrumentSelector.getInstrumentUnit() == null) {
                        String str3 = this.meterName;
                        if (str3 != null ? str3.equals(instrumentSelector.getMeterName()) : instrumentSelector.getMeterName() == null) {
                            String str4 = this.meterVersion;
                            if (str4 != null ? str4.equals(instrumentSelector.getMeterVersion()) : instrumentSelector.getMeterVersion() == null) {
                                String str5 = this.meterSchemaUrl;
                                if (str5 != null ? str5.equals(instrumentSelector.getMeterSchemaUrl()) : instrumentSelector.getMeterSchemaUrl() == null) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        InstrumentType instrumentType = this.instrumentType;
        int hashCode = ((instrumentType == null ? 0 : instrumentType.hashCode()) ^ 1000003) * 1000003;
        String str = this.instrumentName;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.instrumentUnit;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.meterName;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.meterVersion;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.meterSchemaUrl;
        return hashCode5 ^ (str5 != null ? str5.hashCode() : 0);
    }
}
