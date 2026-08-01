package oa;

import com.onesignal.common.modeling.c;
import com.onesignal.common.modeling.d;
import com.onesignal.common.modeling.i;
import com.onesignal.common.modeling.j;
import java.io.Closeable;
import kotlin.jvm.internal.Intrinsics;
import na.e;
import na.f;
import na.g;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class a implements d, ra.a, Closeable {
    private final f opRepo;
    private final c store;

    public a(c cVar, f fVar) {
        cVar.getClass();
        fVar.getClass();
        this.store = cVar;
        this.opRepo = fVar;
    }

    @Override // ra.a
    public void bootstrap() {
        this.store.subscribe(this);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.store.unsubscribe(this);
    }

    public abstract g getAddOperation(i iVar);

    public abstract g getRemoveOperation(i iVar);

    public abstract g getUpdateOperation(i iVar, String str, String str2, Object obj, Object obj2);

    @Override // com.onesignal.common.modeling.d
    public void onModelAdded(i iVar, String str) {
        g addOperation;
        iVar.getClass();
        str.getClass();
        if (Intrinsics.a(str, "NORMAL") && (addOperation = getAddOperation(iVar)) != null) {
            e.enqueue$default(this.opRepo, addOperation, false, 2, null);
        }
    }

    @Override // com.onesignal.common.modeling.d
    public void onModelRemoved(i iVar, String str) {
        g removeOperation;
        iVar.getClass();
        str.getClass();
        if (Intrinsics.a(str, "NORMAL") && (removeOperation = getRemoveOperation(iVar)) != null) {
            e.enqueue$default(this.opRepo, removeOperation, false, 2, null);
        }
    }

    @Override // com.onesignal.common.modeling.d
    public void onModelUpdated(j jVar, String str) {
        jVar.getClass();
        str.getClass();
        if (Intrinsics.a(str, "NORMAL")) {
            i model = jVar.getModel();
            model.getClass();
            g updateOperation = getUpdateOperation(model, jVar.getPath(), jVar.getProperty(), jVar.getOldValue(), jVar.getNewValue());
            if (updateOperation != null) {
                e.enqueue$default(this.opRepo, updateOperation, false, 2, null);
            }
        }
    }
}
