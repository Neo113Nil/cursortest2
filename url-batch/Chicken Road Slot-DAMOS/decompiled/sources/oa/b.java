package oa;

import com.onesignal.common.modeling.g;
import com.onesignal.common.modeling.i;
import com.onesignal.common.modeling.j;
import java.io.Closeable;
import kotlin.jvm.internal.Intrinsics;
import na.e;
import na.f;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class b implements g, ra.a, Closeable {
    private final f opRepo;
    private final com.onesignal.common.modeling.f store;

    public b(com.onesignal.common.modeling.f fVar, f fVar2) {
        fVar.getClass();
        fVar2.getClass();
        this.store = fVar;
        this.opRepo = fVar2;
    }

    @Override // ra.a
    public void bootstrap() {
        this.store.subscribe(this);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.store.unsubscribe(this);
    }

    public abstract na.g getReplaceOperation(i iVar);

    public abstract na.g getUpdateOperation(i iVar, String str, String str2, Object obj, Object obj2);

    @Override // com.onesignal.common.modeling.g
    public void onModelReplaced(i iVar, String str) {
        na.g replaceOperation;
        iVar.getClass();
        str.getClass();
        if (Intrinsics.a(str, "NORMAL") && (replaceOperation = getReplaceOperation(iVar)) != null) {
            e.enqueue$default(this.opRepo, replaceOperation, false, 2, null);
        }
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelUpdated(j jVar, String str) {
        jVar.getClass();
        str.getClass();
        if (Intrinsics.a(str, "NORMAL")) {
            i model = jVar.getModel();
            model.getClass();
            na.g updateOperation = getUpdateOperation(model, jVar.getPath(), jVar.getProperty(), jVar.getOldValue(), jVar.getNewValue());
            if (updateOperation != null) {
                e.enqueue$default(this.opRepo, updateOperation, false, 2, null);
            }
        }
    }
}
