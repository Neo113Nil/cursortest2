package androidx.datastore.core;

import androidx.datastore.core.DataMigrationInitializer;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DataMigrationInitializer.kt */
@Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.DataMigrationInitializer$Companion", f = "DataMigrationInitializer.kt", l = {42, 57}, m = "runMigrations")
/* loaded from: classes9.dex */
final class DataMigrationInitializer$Companion$runMigrations$1<T> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DataMigrationInitializer.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataMigrationInitializer$Companion$runMigrations$1(DataMigrationInitializer.Companion companion, Continuation continuation) {
        super(continuation);
        this.this$0 = companion;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object runMigrations;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        runMigrations = this.this$0.runMigrations(null, null, this);
        return runMigrations;
    }
}
