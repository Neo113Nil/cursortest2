package e2;

import com.onesignal.common.modeling.g;
import com.onesignal.common.modeling.j;
import d2.e;
import d2.f;
import java.io.Closeable;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public abstract class b implements g, com.onesignal.core.internal.startup.a, Closeable {
    private final f opRepo;
    private final com.onesignal.common.modeling.f store;

    public b(com.onesignal.common.modeling.f store, f opRepo) {
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

    public abstract d2.g getReplaceOperation(com.onesignal.common.modeling.i iVar);

    public abstract d2.g getUpdateOperation(com.onesignal.common.modeling.i iVar, String str, String str2, Object obj, Object obj2);

    @Override // com.onesignal.common.modeling.g
    public void onModelReplaced(com.onesignal.common.modeling.i model, String tag) {
        d2.g replaceOperation;
        i.e(model, "model");
        i.e(tag, "tag");
        if (tag.equals("NORMAL") && (replaceOperation = getReplaceOperation(model)) != null) {
            e.enqueue$default(this.opRepo, replaceOperation, false, 2, null);
        }
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelUpdated(j args, String tag) {
        i.e(args, "args");
        i.e(tag, "tag");
        if (tag.equals("NORMAL")) {
            com.onesignal.common.modeling.i model = args.getModel();
            i.c(model, "null cannot be cast to non-null type TModel of com.onesignal.core.internal.operations.listeners.SingletonModelStoreListener");
            d2.g updateOperation = getUpdateOperation(model, args.getPath(), args.getProperty(), args.getOldValue(), args.getNewValue());
            if (updateOperation != null) {
                e.enqueue$default(this.opRepo, updateOperation, false, 2, null);
            }
        }
    }
}
