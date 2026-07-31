package z0;

import android.app.Activity;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class i {
    public i addOnCanceledListener(Activity activity, InterfaceC3543d interfaceC3543d) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented.");
    }

    public i addOnCompleteListener(Activity activity, InterfaceC3544e interfaceC3544e) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public abstract i addOnFailureListener(f fVar);

    public abstract i addOnSuccessListener(g gVar);

    public <TContinuationResult> i continueWith(Executor executor, InterfaceC3541b interfaceC3541b) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> i continueWithTask(Executor executor, InterfaceC3541b interfaceC3541b) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public abstract Exception getException();

    public abstract Object getResult();

    public abstract boolean isSuccessful();

    public <TContinuationResult> i onSuccessTask(Executor executor, h hVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    public i addOnCanceledListener(Executor executor, InterfaceC3543d interfaceC3543d) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented.");
    }

    public i addOnCompleteListener(Executor executor, InterfaceC3544e interfaceC3544e) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public <TContinuationResult> i continueWith(InterfaceC3541b interfaceC3541b) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> i continueWithTask(InterfaceC3541b interfaceC3541b) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public <TContinuationResult> i onSuccessTask(h hVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    public i addOnCanceledListener(InterfaceC3543d interfaceC3543d) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented.");
    }

    public i addOnCompleteListener(InterfaceC3544e interfaceC3544e) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }
}
