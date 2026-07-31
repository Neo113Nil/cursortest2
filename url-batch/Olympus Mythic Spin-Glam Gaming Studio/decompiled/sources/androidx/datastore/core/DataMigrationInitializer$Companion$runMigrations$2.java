package androidx.datastore.core;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DataMigrationInitializer.kt */
@Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u0002H\u0001H\u008a@"}, d2 = {"<anonymous>", "T", "startingData"}, k = 3, mv = {1, 5, 1}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2", f = "DataMigrationInitializer.kt", l = {44, 46}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class DataMigrationInitializer$Companion$runMigrations$2 extends SuspendLambda implements Function2 {
    final /* synthetic */ List<Function1> $cleanUps;
    final /* synthetic */ List<DataMigration<Object>> $migrations;
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DataMigrationInitializer$Companion$runMigrations$2(List<? extends DataMigration<Object>> list, List<Function1> list2, Continuation continuation) {
        super(2, continuation);
        this.$migrations = list;
        this.$cleanUps = list2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        DataMigrationInitializer$Companion$runMigrations$2 dataMigrationInitializer$Companion$runMigrations$2 = new DataMigrationInitializer$Companion$runMigrations$2(this.$migrations, this.$cleanUps, continuation);
        dataMigrationInitializer$Companion$runMigrations$2.L$0 = obj;
        return dataMigrationInitializer$Companion$runMigrations$2;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(Object obj, @Nullable Continuation continuation) {
        return ((DataMigrationInitializer$Companion$runMigrations$2) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        List<Function1> list;
        Iterator it;
        DataMigration dataMigration;
        Iterator it2;
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            obj = this.L$0;
            List<DataMigration<Object>> list2 = this.$migrations;
            list = this.$cleanUps;
            it = list2.iterator();
        } else if (i == 1) {
            obj2 = this.L$3;
            DataMigration dataMigration2 = (DataMigration) this.L$2;
            it2 = (Iterator) this.L$1;
            List<Function1> list3 = (List) this.L$0;
            ResultKt.throwOnFailure(obj);
            dataMigration = dataMigration2;
            list = list3;
            if (((Boolean) obj).booleanValue()) {
                obj = obj2;
                it = it2;
            } else {
                list.add(new DataMigrationInitializer$Companion$runMigrations$2$1$1(dataMigration, null));
                this.L$0 = list;
                this.L$1 = it2;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 2;
                obj = dataMigration.migrate(obj2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                it = it2;
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) this.L$1;
            list = (List) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        if (!it.hasNext()) {
            DataMigration dataMigration3 = (DataMigration) it.next();
            this.L$0 = list;
            this.L$1 = it;
            this.L$2 = dataMigration3;
            this.L$3 = obj;
            this.label = 1;
            Object shouldMigrate = dataMigration3.shouldMigrate(obj, this);
            if (shouldMigrate == coroutine_suspended) {
                return coroutine_suspended;
            }
            Iterator it3 = it;
            obj2 = obj;
            obj = shouldMigrate;
            dataMigration = dataMigration3;
            it2 = it3;
            if (((Boolean) obj).booleanValue()) {
            }
            if (!it.hasNext()) {
                return obj;
            }
        }
    }
}
