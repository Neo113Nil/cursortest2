package sqip.internal.nonce;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lsqip/internal/nonce/CreateCardNonceErrorResponse;", "", "errors", "", "Lsqip/internal/nonce/CreateCardNonceError;", "(Ljava/util/List;)V", "getErrors", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "sqip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class CreateCardNonceErrorResponse {
    private final List<CreateCardNonceError> errors;

    public CreateCardNonceErrorResponse(List<CreateCardNonceError> list) {
        list.getClass();
        this.errors = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CreateCardNonceErrorResponse copy$default(CreateCardNonceErrorResponse createCardNonceErrorResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = createCardNonceErrorResponse.errors;
        }
        return createCardNonceErrorResponse.copy(list);
    }

    public final List<CreateCardNonceError> component1() {
        return this.errors;
    }

    public final CreateCardNonceErrorResponse copy(List<CreateCardNonceError> errors) {
        errors.getClass();
        return new CreateCardNonceErrorResponse(errors);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CreateCardNonceErrorResponse) && Intrinsics.areEqual(this.errors, ((CreateCardNonceErrorResponse) other).errors);
    }

    public final List<CreateCardNonceError> getErrors() {
        return this.errors;
    }

    public int hashCode() {
        return this.errors.hashCode();
    }

    public String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m("CreateCardNonceErrorResponse(errors=", ")", this.errors);
    }
}
