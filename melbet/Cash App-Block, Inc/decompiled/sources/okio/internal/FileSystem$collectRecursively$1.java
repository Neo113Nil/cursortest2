package okio.internal;

import java.util.Iterator;
import kotlin.collections.ArrayDeque;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.sequences.SequenceScope;
import okio.FileSystem;
import okio.Path;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* renamed from: okio.internal.-FileSystem$collectRecursively$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class FileSystem$collectRecursively$1 extends ContinuationImpl {
    public SequenceScope L$0;
    public FileSystem L$1;
    public ArrayDeque L$2;
    public Path L$3;
    public Iterator L$4;
    public boolean Z$1;
    public int label;
    public /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return _ZlibJvmKt.collectRecursively(null, null, null, null, false, this);
    }
}
