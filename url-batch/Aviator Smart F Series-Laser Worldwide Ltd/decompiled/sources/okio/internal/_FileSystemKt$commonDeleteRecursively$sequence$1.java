package okio.internal;

import f6.p;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.sequences.o;
import okio.k;
import okio.o0;
import y5.w;

@kotlin.coroutines.jvm.internal.d(c = "okio.internal._FileSystemKt$commonDeleteRecursively$sequence$1", f = "-FileSystem.kt", i = {}, l = {72}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class _FileSystemKt$commonDeleteRecursively$sequence$1 extends RestrictedSuspendLambda implements p {
    final /* synthetic */ o0 $fileOrDirectory;
    final /* synthetic */ k $this_commonDeleteRecursively;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    _FileSystemKt$commonDeleteRecursively$sequence$1(k kVar, o0 o0Var, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.$this_commonDeleteRecursively = kVar;
        this.$fileOrDirectory = o0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
        _FileSystemKt$commonDeleteRecursively$sequence$1 _filesystemkt_commondeleterecursively_sequence_1 = new _FileSystemKt$commonDeleteRecursively$sequence$1(this.$this_commonDeleteRecursively, this.$fileOrDirectory, cVar);
        _filesystemkt_commondeleterecursively_sequence_1.L$0 = obj;
        return _filesystemkt_commondeleterecursively_sequence_1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        int i8 = this.label;
        if (i8 == 0) {
            y5.g.throwOnFailure(obj);
            o oVar = (o) this.L$0;
            k kVar = this.$this_commonDeleteRecursively;
            kotlin.collections.g gVar = new kotlin.collections.g();
            o0 o0Var = this.$fileOrDirectory;
            this.label = 1;
            if (_FileSystemKt.collectRecursively(oVar, kVar, gVar, o0Var, false, true, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y5.g.throwOnFailure(obj);
        }
        return w.INSTANCE;
    }

    @Override // f6.p
    public final Object invoke(o oVar, kotlin.coroutines.c cVar) {
        return ((_FileSystemKt$commonDeleteRecursively$sequence$1) create(oVar, cVar)).invokeSuspend(w.INSTANCE);
    }
}
