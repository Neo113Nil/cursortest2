package com.squareup.protos.cash.kgoose.api.v3;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesList;
import kotlin.jvm.internal.Reflection;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ModelProvider;", "Lcom/squareup/wire/WireEnum;", "", "", "value", "I", "getValue", "()I", "Companion", "MODEL_PROVIDER_UNSPECIFIED", "MODEL_PROVIDER_DATABRICKS", "MODEL_PROVIDER_GROQ", "MODEL_PROVIDER_CEREBRAS", "MODEL_PROVIDER_OPENAI", "MODEL_PROVIDER_GONDOLA", "MODEL_PROVIDER_OPENROUTER", "MODEL_PROVIDER_ANTHROPIC", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ModelProvider implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ModelProvider[] $VALUES;
    public static final ProtoAdapter ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final ModelProvider MODEL_PROVIDER_ANTHROPIC;
    public static final ModelProvider MODEL_PROVIDER_CEREBRAS;
    public static final ModelProvider MODEL_PROVIDER_DATABRICKS;

    @Deprecated
    public static final ModelProvider MODEL_PROVIDER_GONDOLA;
    public static final ModelProvider MODEL_PROVIDER_GROQ;
    public static final ModelProvider MODEL_PROVIDER_OPENAI;
    public static final ModelProvider MODEL_PROVIDER_OPENROUTER;
    public static final ModelProvider MODEL_PROVIDER_UNSPECIFIED;
    private final int value;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ModelProvider$Companion;", "", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/ModelProvider;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        ModelProvider modelProvider = new ModelProvider("MODEL_PROVIDER_UNSPECIFIED", 0, 0);
        MODEL_PROVIDER_UNSPECIFIED = modelProvider;
        ModelProvider modelProvider2 = new ModelProvider("MODEL_PROVIDER_DATABRICKS", 1, 1);
        MODEL_PROVIDER_DATABRICKS = modelProvider2;
        ModelProvider modelProvider3 = new ModelProvider("MODEL_PROVIDER_GROQ", 2, 2);
        MODEL_PROVIDER_GROQ = modelProvider3;
        ModelProvider modelProvider4 = new ModelProvider("MODEL_PROVIDER_CEREBRAS", 3, 3);
        MODEL_PROVIDER_CEREBRAS = modelProvider4;
        ModelProvider modelProvider5 = new ModelProvider("MODEL_PROVIDER_OPENAI", 4, 5);
        MODEL_PROVIDER_OPENAI = modelProvider5;
        ModelProvider modelProvider6 = new ModelProvider("MODEL_PROVIDER_GONDOLA", 5, 6);
        MODEL_PROVIDER_GONDOLA = modelProvider6;
        ModelProvider modelProvider7 = new ModelProvider("MODEL_PROVIDER_OPENROUTER", 6, 7);
        MODEL_PROVIDER_OPENROUTER = modelProvider7;
        ModelProvider modelProvider8 = new ModelProvider("MODEL_PROVIDER_ANTHROPIC", 7, 8);
        MODEL_PROVIDER_ANTHROPIC = modelProvider8;
        ModelProvider[] modelProviderArr = {modelProvider, modelProvider2, modelProvider3, modelProvider4, modelProvider5, modelProvider6, modelProvider7, modelProvider8};
        $VALUES = modelProviderArr;
        $ENTRIES = new EnumEntriesList(modelProviderArr);
        INSTANCE = new Companion();
        ADAPTER = new ModelProvider$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ModelProvider.class), Syntax.PROTO_2, modelProvider);
    }

    public ModelProvider(String str, int i, int i2) {
        this.value = i2;
    }

    public static final ModelProvider fromValue(int i) {
        INSTANCE.getClass();
        switch (i) {
            case 0:
                return MODEL_PROVIDER_UNSPECIFIED;
            case 1:
                return MODEL_PROVIDER_DATABRICKS;
            case 2:
                return MODEL_PROVIDER_GROQ;
            case 3:
                return MODEL_PROVIDER_CEREBRAS;
            case 4:
            default:
                return null;
            case 5:
                return MODEL_PROVIDER_OPENAI;
            case 6:
                return MODEL_PROVIDER_GONDOLA;
            case 7:
                return MODEL_PROVIDER_OPENROUTER;
            case 8:
                return MODEL_PROVIDER_ANTHROPIC;
        }
    }

    public static ModelProvider valueOf(String str) {
        return (ModelProvider) Enum.valueOf(ModelProvider.class, str);
    }

    public static ModelProvider[] values() {
        return (ModelProvider[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
