package androidx.compose.runtime.tooling;

import androidx.compose.runtime.internal.StabilityInferred;
import com.ironsource.X3;
import java.util.List;
import kotlin.Metadata;

/* compiled from: SourceInformation.kt */
@StabilityInferred
@ComposeToolingApi
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\b\u0012\u0006\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0003\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0004\u0010\u0012R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u001a\u0010\u0015R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\b8\u0006¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u000e\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0013\u001a\u0004\b\u001c\u0010\u0015¨\u0006\u001d"}, d2 = {"Landroidx/compose/runtime/tooling/SourceInformation;", "", "", "isCall", "isInline", "", X3.g.b, "sourceFile", "", "Landroidx/compose/runtime/tooling/ParameterSourceInformation;", "parameters", "packageHash", "Landroidx/compose/runtime/tooling/LocationSourceInformation;", "locations", "rawData", "<init>", "(ZZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "Z", "()Z", "Ljava/lang/String;", "getFunctionName", "()Ljava/lang/String;", "getSourceFile", "Ljava/util/List;", "getParameters", "()Ljava/util/List;", "getPackageHash", "getLocations", "getRawData", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SourceInformation {
    private final String functionName;
    private final boolean isCall;
    private final boolean isInline;
    private final List locations;
    private final String packageHash;
    private final List parameters;
    private final String rawData;
    private final String sourceFile;

    public SourceInformation(boolean z, boolean z2, String str, String str2, List list, String str3, List list2, String str4) {
        this.isCall = z;
        this.isInline = z2;
        this.functionName = str;
        this.sourceFile = str2;
        this.parameters = list;
        this.packageHash = str3;
        this.locations = list2;
        this.rawData = str4;
    }

    /* renamed from: isCall, reason: from getter */
    public final boolean getIsCall() {
        return this.isCall;
    }

    public final String getFunctionName() {
        return this.functionName;
    }

    public final String getSourceFile() {
        return this.sourceFile;
    }

    public final String getPackageHash() {
        return this.packageHash;
    }

    public final List getLocations() {
        return this.locations;
    }
}
