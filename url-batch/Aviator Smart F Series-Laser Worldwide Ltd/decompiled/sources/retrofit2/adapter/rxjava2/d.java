package retrofit2.adapter.rxjava2;

import javax.annotation.Nullable;
import retrofit2.u;

/* loaded from: classes5.dex */
public final class d {

    @Nullable
    private final Throwable error;

    @Nullable
    private final u response;

    private d(@Nullable u uVar, @Nullable Throwable th) {
        this.response = uVar;
        this.error = th;
    }

    @Nullable
    public Throwable error() {
        return this.error;
    }

    public boolean isError() {
        return this.error != null;
    }

    @Nullable
    public u response() {
        return this.response;
    }

    public static <T> d error(Throwable th) {
        if (th != null) {
            return new d(null, th);
        }
        throw new NullPointerException("error == null");
    }

    public static <T> d response(u uVar) {
        if (uVar != null) {
            return new d(uVar, null);
        }
        throw new NullPointerException("response == null");
    }
}
