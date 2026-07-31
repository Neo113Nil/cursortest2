package androidx.datastore.migrations;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.datastore.core.DataMigration;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SharedPreferencesMigration.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001$J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R3\u0010\u0014\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00118\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R9\u0010\u000e\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00168\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u000e\u0010\u0018R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0019R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, d2 = {"Landroidx/datastore/migrations/SharedPreferencesMigration;", "T", "Landroidx/datastore/core/DataMigration;", "Landroid/content/Context;", "context", "", "name", "", "deleteSharedPreferences", "(Landroid/content/Context;Ljava/lang/String;)V", "currentData", "", "shouldMigrate", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "migrate", "cleanUp", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "shouldRunMigration", "Lkotlin/jvm/functions/Function2;", "Lkotlin/Function3;", "Landroidx/datastore/migrations/SharedPreferencesView;", "Lkotlin/jvm/functions/Function3;", "Landroid/content/Context;", "Ljava/lang/String;", "Landroid/content/SharedPreferences;", "sharedPrefs$delegate", "Lkotlin/Lazy;", "getSharedPrefs", "()Landroid/content/SharedPreferences;", "sharedPrefs", "", "keySet", "Ljava/util/Set;", "Api24Impl", "datastore_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes12.dex */
public final class SharedPreferencesMigration<T> implements DataMigration<T> {
    private final Context context;
    private final Set keySet;
    private final Function3 migrate;
    private final String name;

    /* renamed from: sharedPrefs$delegate, reason: from kotlin metadata */
    private final Lazy sharedPrefs;
    private final Function2 shouldRunMigration;

    /* compiled from: SharedPreferencesMigration.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@"}, d2 = {"<anonymous>", "", "T", "it"}, k = 3, mv = {1, 5, 1}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.migrations.SharedPreferencesMigration$1", f = "SharedPreferencesMigration.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.datastore.migrations.SharedPreferencesMigration$1, reason: invalid class name */
    /* loaded from: classes5.dex */
    final class AnonymousClass1 extends SuspendLambda implements Function2 {
        int label;

        AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(Object obj, @Nullable Continuation continuation) {
            return ((AnonymousClass1) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(true);
        }
    }

    /* compiled from: SharedPreferencesMigration.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@"}, d2 = {"<anonymous>", "", "T", "it"}, k = 3, mv = {1, 5, 1}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.migrations.SharedPreferencesMigration$2", f = "SharedPreferencesMigration.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.datastore.migrations.SharedPreferencesMigration$2, reason: invalid class name */
    /* loaded from: classes5.dex */
    final class AnonymousClass2 extends SuspendLambda implements Function2 {
        int label;

        AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(Object obj, @Nullable Continuation continuation) {
            return ((AnonymousClass2) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(true);
        }
    }

    /* compiled from: SharedPreferencesMigration.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@"}, d2 = {"<anonymous>", "", "T", "it"}, k = 3, mv = {1, 5, 1}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.migrations.SharedPreferencesMigration$3", f = "SharedPreferencesMigration.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.datastore.migrations.SharedPreferencesMigration$3, reason: invalid class name */
    /* loaded from: classes5.dex */
    final class AnonymousClass3 extends SuspendLambda implements Function2 {
        int label;

        AnonymousClass3(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return new AnonymousClass3(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(Object obj, @Nullable Continuation continuation) {
            return ((AnonymousClass3) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(true);
        }
    }

    /* compiled from: SharedPreferencesMigration.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n"}, d2 = {"<anonymous>", "Landroid/content/SharedPreferences;", "T"}, k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: androidx.datastore.migrations.SharedPreferencesMigration$4, reason: invalid class name */
    /* loaded from: classes5.dex */
    final class AnonymousClass4 extends Lambda implements Function0 {
        final /* synthetic */ Context $context;
        final /* synthetic */ String $sharedPreferencesName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(Context context, String str) {
            super(0);
            this.$context = context;
            this.$sharedPreferencesName = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final SharedPreferences mo4828invoke() {
            SharedPreferences sharedPreferences = this.$context.getSharedPreferences(this.$sharedPreferencesName, 0);
            Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPreferences(sharedPreferencesName, Context.MODE_PRIVATE)");
            return sharedPreferences;
        }
    }

    private final SharedPreferences getSharedPrefs() {
        return (SharedPreferences) this.sharedPrefs.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006a, code lost:
    
        if (r5.isEmpty() == false) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // androidx.datastore.core.DataMigration
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object shouldMigrate(Object obj, Continuation continuation) {
        SharedPreferencesMigration$shouldMigrate$1 sharedPreferencesMigration$shouldMigrate$1;
        Object obj2;
        int i;
        SharedPreferencesMigration<T> sharedPreferencesMigration;
        if (continuation instanceof SharedPreferencesMigration$shouldMigrate$1) {
            sharedPreferencesMigration$shouldMigrate$1 = (SharedPreferencesMigration$shouldMigrate$1) continuation;
            int i2 = sharedPreferencesMigration$shouldMigrate$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sharedPreferencesMigration$shouldMigrate$1.label = i2 - Integer.MIN_VALUE;
                obj2 = sharedPreferencesMigration$shouldMigrate$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = sharedPreferencesMigration$shouldMigrate$1.label;
                boolean z = true;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    Function2 function2 = this.shouldRunMigration;
                    sharedPreferencesMigration$shouldMigrate$1.L$0 = this;
                    sharedPreferencesMigration$shouldMigrate$1.label = 1;
                    obj2 = function2.invoke(obj, sharedPreferencesMigration$shouldMigrate$1);
                    if (obj2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    sharedPreferencesMigration = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sharedPreferencesMigration = (SharedPreferencesMigration) sharedPreferencesMigration$shouldMigrate$1.L$0;
                    ResultKt.throwOnFailure(obj2);
                }
                if (((Boolean) obj2).booleanValue()) {
                    return Boxing.boxBoolean(false);
                }
                Set set = sharedPreferencesMigration.keySet;
                if (set == null) {
                    Map<String, ?> all = sharedPreferencesMigration.getSharedPrefs().getAll();
                    Intrinsics.checkNotNullExpressionValue(all, "sharedPrefs.all");
                } else {
                    Set set2 = set;
                    SharedPreferences sharedPrefs = sharedPreferencesMigration.getSharedPrefs();
                    if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                        Iterator<T> it = set2.iterator();
                        while (it.hasNext()) {
                            if (Boxing.boxBoolean(sharedPrefs.contains((String) it.next())).booleanValue()) {
                                break;
                            }
                        }
                    }
                    z = false;
                    return Boxing.boxBoolean(z);
                }
            }
        }
        sharedPreferencesMigration$shouldMigrate$1 = new SharedPreferencesMigration$shouldMigrate$1(this, continuation);
        obj2 = sharedPreferencesMigration$shouldMigrate$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = sharedPreferencesMigration$shouldMigrate$1.label;
        boolean z2 = true;
        if (i != 0) {
        }
        if (((Boolean) obj2).booleanValue()) {
        }
    }

    @Override // androidx.datastore.core.DataMigration
    public Object migrate(Object obj, Continuation continuation) {
        return this.migrate.invoke(new SharedPreferencesView(getSharedPrefs(), this.keySet), obj, continuation);
    }

    @Override // androidx.datastore.core.DataMigration
    public Object cleanUp(Continuation continuation) {
        Unit unit;
        Context context;
        String str;
        SharedPreferences.Editor edit = getSharedPrefs().edit();
        Set set = this.keySet;
        if (set == null) {
            edit.clear();
        } else {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                edit.remove((String) it.next());
            }
        }
        if (!edit.commit()) {
            throw new IOException("Unable to delete migrated keys from SharedPreferences.");
        }
        if (getSharedPrefs().getAll().isEmpty() && (context = this.context) != null && (str = this.name) != null) {
            deleteSharedPreferences(context, str);
        }
        Set set2 = this.keySet;
        if (set2 == null) {
            unit = null;
        } else {
            set2.clear();
            unit = Unit.INSTANCE;
        }
        return unit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? unit : Unit.INSTANCE;
    }

    private final void deleteSharedPreferences(Context context, String name) {
        if (!Api24Impl.deleteSharedPreferences(context, name)) {
            throw new IOException(Intrinsics.stringPlus("Unable to delete SharedPreferences: ", name));
        }
    }

    /* compiled from: SharedPreferencesMigration.kt */
    @RequiresApi
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Landroidx/datastore/migrations/SharedPreferencesMigration$Api24Impl;", "", "()V", "deleteSharedPreferences", "", "context", "Landroid/content/Context;", "name", "", "datastore_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    private static final class Api24Impl {
        public static final Api24Impl INSTANCE = new Api24Impl();

        private Api24Impl() {
        }

        @DoNotInline
        public static final boolean deleteSharedPreferences(@NotNull Context context, @NotNull String name) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(name, "name");
            return context.deleteSharedPreferences(name);
        }
    }
}
