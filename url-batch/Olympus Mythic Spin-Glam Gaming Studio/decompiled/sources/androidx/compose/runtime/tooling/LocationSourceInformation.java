package androidx.compose.runtime.tooling;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* compiled from: SourceInformation.kt */
@StabilityInferred
@ComposeToolingApi
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0007\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/runtime/tooling/LocationSourceInformation;", "", "", "lineNumber", "offset", "length", "", "isRepeatable", "<init>", "(IIIZ)V", "I", "getLineNumber", "()I", "getOffset", "getLength", "Z", "()Z", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LocationSourceInformation {
    private final boolean isRepeatable;
    private final int length;
    private final int lineNumber;
    private final int offset;

    public LocationSourceInformation(int i, int i2, int i3, boolean z) {
        this.lineNumber = i;
        this.offset = i2;
        this.length = i3;
        this.isRepeatable = z;
    }

    public final int getLineNumber() {
        return this.lineNumber;
    }
}
