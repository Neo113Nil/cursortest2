package okio.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;
import okio.FileSystem;
import okio.Path;
import papa.SafeTrace;

/* renamed from: okio.internal.-FileSystem$commonListRecursively$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class FileSystem$commonListRecursively$1 extends RestrictedSuspendLambda implements Function2 {
    public final /* synthetic */ Path $dir;
    public final /* synthetic */ FileSystem $this_commonListRecursively;
    public /* synthetic */ Object L$0;
    public ArrayDeque L$1;
    public Iterator L$2;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileSystem$commonListRecursively$1(Path path, FileSystem fileSystem, Continuation continuation) {
        super(2, continuation);
        this.$dir = path;
        this.$this_commonListRecursively = fileSystem;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FileSystem$commonListRecursively$1 fileSystem$commonListRecursively$1 = new FileSystem$commonListRecursively$1(this.$dir, this.$this_commonListRecursively, continuation);
        fileSystem$commonListRecursively$1.L$0 = obj;
        return fileSystem$commonListRecursively$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FileSystem$commonListRecursively$1) create((SequenceScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0044  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0059 -> B:5:0x005c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ArrayDeque arrayDeque;
        Iterator it;
        SequenceScope sequenceScope;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        FileSystem fileSystem = this.$this_commonListRecursively;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            SequenceScope sequenceScope2 = (SequenceScope) this.L$0;
            ArrayDeque arrayDeque2 = new ArrayDeque();
            Path path = this.$dir;
            arrayDeque2.addLast(path);
            arrayDeque = arrayDeque2;
            it = fileSystem.list(path).iterator();
            sequenceScope = sequenceScope2;
            if (it.hasNext()) {
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = this.L$2;
            ArrayDeque arrayDeque3 = this.L$1;
            SequenceScope sequenceScope3 = (SequenceScope) this.L$0;
            SafeTrace.throwOnFailure(obj);
            arrayDeque = arrayDeque3;
            sequenceScope = sequenceScope3;
            FileSystem$commonListRecursively$1 fileSystem$commonListRecursively$1 = this;
            this = fileSystem$commonListRecursively$1;
            if (it.hasNext()) {
                Path path2 = (Path) it.next();
                this.L$0 = sequenceScope;
                this.L$1 = arrayDeque;
                this.L$2 = it;
                this.label = 1;
                fileSystem$commonListRecursively$1 = this;
                if (_ZlibJvmKt.collectRecursively(sequenceScope, fileSystem, arrayDeque, path2, false, fileSystem$commonListRecursively$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                this = fileSystem$commonListRecursively$1;
                if (it.hasNext()) {
                    return Unit.INSTANCE;
                }
            }
        }
    }
}
