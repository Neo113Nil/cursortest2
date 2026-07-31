package gbcorp.c312.merkmarker.info.di;

import kotlin.Metadata;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;

/* compiled from: DispatcherModule.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007¨\u0006\f"}, d2 = {"Lgbcorp/c312/merkmarker/info/di/DispatchersQualifiers;", "", "<init>", "()V", "IO", "Lorg/koin/core/qualifier/StringQualifier;", "getIO", "()Lorg/koin/core/qualifier/StringQualifier;", "Default", "getDefault", "Main", "getMain", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DispatchersQualifiers {
    public static final DispatchersQualifiers INSTANCE = new DispatchersQualifiers();
    private static final StringQualifier IO = QualifierKt.named("IO");
    private static final StringQualifier Default = QualifierKt.named("Default");
    private static final StringQualifier Main = QualifierKt.named("Main");
    public static final int $stable = 8;

    private DispatchersQualifiers() {
    }

    public final StringQualifier getIO() {
        return IO;
    }

    public final StringQualifier getDefault() {
        return Default;
    }

    public final StringQualifier getMain() {
        return Main;
    }
}
