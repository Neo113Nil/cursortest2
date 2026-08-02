package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;

/* loaded from: classes9.dex */
public final class JvmNameResolver extends JvmNameResolverBase {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JvmNameResolver(JvmProtoBuf.StringTableTypes stringTableTypes, String[] strArr) {
        super(strArr, r0, JvmNameResolverKt.toExpandedRecordsList(r3));
        stringTableTypes.getClass();
        strArr.getClass();
        List<Integer> localNameList = stringTableTypes.getLocalNameList();
        Set set = localNameList.isEmpty() ? EmptySet.INSTANCE : CollectionsKt.toSet(localNameList);
        List<JvmProtoBuf.StringTableTypes.Record> recordList = stringTableTypes.getRecordList();
        recordList.getClass();
    }
}
