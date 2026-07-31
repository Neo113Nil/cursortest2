package e2;

import com.onesignal.common.modeling.c;
import com.onesignal.common.modeling.d;
import com.onesignal.common.modeling.j;
import d2.e;
import d2.f;
import d2.g;
import java.io.Closeable;
import kotlin.jvm.internal.i;

/* renamed from: e2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0343a implements d, com.onesignal.core.internal.startup.a, Closeable {
    private final f opRepo;
    private final c store;

    public AbstractC0343a(c store, f opRepo) {
        i.e(store, "store");
        i.e(opRepo, "opRepo");
        this.store = store;
        this.opRepo = opRepo;
    }

    @Override // com.onesignal.core.internal.startup.a
    public void bootstrap() {
        this.store.subscribe(this);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.store.unsubscribe(this);
    }

    public abstract g getAddOperation(com.onesignal.common.modeling.i iVar);

    public abstract g getRemoveOperation(com.onesignal.common.modeling.i iVar);

    public abstract g getUpdateOperation(com.onesignal.common.modeling.i iVar, String str, String str2, Object obj, Object obj2);

    @Override // com.onesignal.common.modeling.d
    public void onModelAdded(com.onesignal.common.modeling.i model, String tag) {
        g addOperation;
        i.e(model, "model");
        i.e(tag, "tag");
        if (tag.equals("NORMAL") && (addOperation = getAddOperation(model)) != null) {
            e.enqueue$default(this.opRepo, addOperation, false, 2, null);
        }
    }

    @Override // com.onesignal.common.modeling.d
    public void onModelRemoved(com.onesignal.common.modeling.i model, String tag) {
        g removeOperation;
        i.e(model, "model");
        i.e(tag, "tag");
        if (tag.equals("NORMAL") && (removeOperation = getRemoveOperation(model)) != null) {
            e.enqueue$default(this.opRepo, removeOperation, false, 2, null);
        }
    }

    @Override // com.onesignal.common.modeling.d
    public void onModelUpdated(j args, String tag) {
        i.e(args, "args");
        i.e(tag, "tag");
        if (tag.equals("NORMAL")) {
            com.onesignal.common.modeling.i model = args.getModel();
            i.c(model, "null cannot be cast to non-null type TModel of com.onesignal.core.internal.operations.listeners.ModelStoreListener");
            g updateOperation = getUpdateOperation(model, args.getPath(), args.getProperty(), args.getOldValue(), args.getNewValue());
            if (updateOperation != null) {
                e.enqueue$default(this.opRepo, updateOperation, false, 2, null);
            }
        }
    }
}
