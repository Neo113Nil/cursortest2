package kotlinx.serialization.json;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class JsonConfiguration {
    public final boolean allowStructuredMapKeys;
    public final String classDiscriminator;
    public final ClassDiscriminatorMode classDiscriminatorMode;
    public final boolean coerceInputValues;
    public final boolean encodeDefaults;
    public final boolean exceptionsWithDebugInfo;
    public final boolean explicitNulls;
    public final boolean ignoreUnknownKeys;
    public final boolean isLenient;
    public final String prettyPrintIndent;
    public final boolean useAlternativeNames;
    public final boolean useArrayPolymorphism;

    public JsonConfiguration(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str, boolean z6, boolean z7, String str2, boolean z8, ClassDiscriminatorMode classDiscriminatorMode, boolean z9) {
        str.getClass();
        str2.getClass();
        classDiscriminatorMode.getClass();
        this.encodeDefaults = z;
        this.ignoreUnknownKeys = z2;
        this.isLenient = z3;
        this.allowStructuredMapKeys = z4;
        this.explicitNulls = z5;
        this.prettyPrintIndent = str;
        this.coerceInputValues = z6;
        this.useArrayPolymorphism = z7;
        this.classDiscriminator = str2;
        this.useAlternativeNames = z8;
        this.classDiscriminatorMode = classDiscriminatorMode;
        this.exceptionsWithDebugInfo = z9;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JsonConfiguration(encodeDefaults=");
        sb.append(this.encodeDefaults);
        sb.append(", ignoreUnknownKeys=");
        sb.append(this.ignoreUnknownKeys);
        sb.append(", isLenient=");
        sb.append(this.isLenient);
        sb.append(", allowStructuredMapKeys=");
        sb.append(this.allowStructuredMapKeys);
        sb.append(", prettyPrint=false, explicitNulls=");
        sb.append(this.explicitNulls);
        sb.append(", prettyPrintIndent='");
        sb.append(this.prettyPrintIndent);
        sb.append("', coerceInputValues=");
        sb.append(this.coerceInputValues);
        sb.append(", useArrayPolymorphism=");
        sb.append(this.useArrayPolymorphism);
        sb.append(", classDiscriminator='");
        sb.append(this.classDiscriminator);
        sb.append("', allowSpecialFloatingPointValues=false, useAlternativeNames=");
        sb.append(this.useAlternativeNames);
        sb.append(", namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, allowComments=false, classDiscriminatorMode=");
        sb.append(this.classDiscriminatorMode);
        sb.append(", exceptionsWithDebugInfo=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.exceptionsWithDebugInfo, ')');
    }
}
