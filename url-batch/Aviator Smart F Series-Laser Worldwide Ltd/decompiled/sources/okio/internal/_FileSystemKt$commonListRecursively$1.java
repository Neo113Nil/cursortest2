package okio.internal;

import f6.p;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.sequences.o;
import okio.k;
import okio.o0;
import y5.w;

@kotlin.coroutines.jvm.internal.d(c = "okio.internal._FileSystemKt$commonListRecursively$1", f = "-FileSystem.kt", i = {0, 0}, l = {93}, m = "invokeSuspend", n = {"$this$sequence", "stack"}, s = {"L$0", "L$1"})
/* loaded from: classes5.dex */
final class _FileSystemKt$commonListRecursively$1 extends RestrictedSuspendLambda implements p {
    final /* synthetic */ o0 $dir;
    final /* synthetic */ boolean $followSymlinks;
    final /* synthetic */ k $this_commonListRecursively;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    _FileSystemKt$commonListRecursively$1(o0 o0Var, k kVar, boolean z7, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.$dir = o0Var;
        this.$this_commonListRecursively = kVar;
        this.$followSymlinks = z7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
        _FileSystemKt$commonListRecursively$1 _filesystemkt_commonlistrecursively_1 = new _FileSystemKt$commonListRecursively$1(this.$dir, this.$this_commonListRecursively, this.$followSymlinks, cVar);
        _filesystemkt_commonlistrecursively_1.L$0 = obj;
        return _filesystemkt_commonlistrecursively_1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        _FileSystemKt$commonListRecursively$1 _filesystemkt_commonlistrecursively_1;
        o oVar;
        kotlin.collections.g gVar;
        Iterator<o0> it;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        int i8 = this.label;
        if (i8 == 0) {
            y5.g.throwOnFailure(obj);
            o oVar2 = (o) this.L$0;
            kotlin.collections.g gVar2 = new kotlin.collections.g();
            gVar2.addLast(this.$dir);
            _filesystemkt_commonlistrecursively_1 = this;
            oVar = oVar2;
            gVar = gVar2;
            it = this.$this_commonListRecursively.list(this.$dir).iterator();
        } else {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) this.L$2;
            kotlin.collections.g gVar3 = (kotlin.collections.g) this.L$1;
            o oVar3 = (o) this.L$0;
            y5.g.throwOnFailure(obj);
            _filesystemkt_commonlistrecursively_1 = this;
            gVar = gVar3;
            oVar = oVar3;
        }
        while (it.hasNext()) {
            o0 next = it.next();
            k kVar = _filesystemkt_commonlistrecursively_1.$this_commonListRecursively;
            boolean z7 = _filesystemkt_commonlistrecursively_1.$followSymlinks;
            _filesystemkt_commonlistrecursively_1.L$0 = oVar;
            _filesystemkt_commonlistrecursively_1.L$1 = gVar;
            _filesystemkt_commonlistrecursively_1.L$2 = it;
            _filesystemkt_commonlistrecursively_1.label = 1;
            if (_FileSystemKt.collectRecursively(oVar, kVar, gVar, next, z7, false, _filesystemkt_commonlistrecursively_1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return w.INSTANCE;
    }

    @Override // f6.p
    public final Object invoke(o oVar, kotlin.coroutines.c cVar) {
        return ((_FileSystemKt$commonListRecursively$1) create(oVar, cVar)).invokeSuspend(w.INSTANCE);
    }
}
