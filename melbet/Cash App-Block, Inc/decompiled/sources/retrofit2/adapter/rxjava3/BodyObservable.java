package retrofit2.adapter.rxjava3;

import androidx.media3.common.FlagSet;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import net.idrnd.misnap.iad.Payload;

/* loaded from: classes9.dex */
public final class BodyObservable extends Observable {
    public final /* synthetic */ int $r8$classId;
    public final Observable upstream;

    public /* synthetic */ BodyObservable(Observable observable, int i) {
        this.$r8$classId = i;
        this.upstream = observable;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        int i = this.$r8$classId;
        Observable observable = this.upstream;
        switch (i) {
            case 0:
                observable.subscribe(new FlagSet.Builder(observer, 13));
                break;
            default:
                observable.subscribe(new Payload(observer, 17));
                break;
        }
    }
}
