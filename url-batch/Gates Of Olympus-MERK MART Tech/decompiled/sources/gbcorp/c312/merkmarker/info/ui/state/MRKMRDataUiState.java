package gbcorp.c312.merkmarker.info.ui.state;

import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.messaging.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MRKMRDataUiState.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \b*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Lgbcorp/c312/merkmarker/info/ui/state/MRKMRDataUiState;", ExifInterface.GPS_DIRECTION_TRUE, "", "<init>", "()V", "Initial", "Empty", "Populated", "Companion", "Lgbcorp/c312/merkmarker/info/ui/state/MRKMRDataUiState$Empty;", "Lgbcorp/c312/merkmarker/info/ui/state/MRKMRDataUiState$Initial;", "Lgbcorp/c312/merkmarker/info/ui/state/MRKMRDataUiState$Populated;", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class MRKMRDataUiState<T> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public /* synthetic */ MRKMRDataUiState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private MRKMRDataUiState() {
    }

    /* compiled from: MRKMRDataUiState.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lgbcorp/c312/merkmarker/info/ui/state/MRKMRDataUiState$Initial;", "Lgbcorp/c312/merkmarker/info/ui/state/MRKMRDataUiState;", "", "<init>", "()V", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Initial extends MRKMRDataUiState {
        public static final int $stable = 0;
        public static final Initial INSTANCE = new Initial();

        private Initial() {
            super(null);
        }
    }

    /* compiled from: MRKMRDataUiState.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lgbcorp/c312/merkmarker/info/ui/state/MRKMRDataUiState$Empty;", "Lgbcorp/c312/merkmarker/info/ui/state/MRKMRDataUiState;", "", "<init>", "()V", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Empty extends MRKMRDataUiState {
        public static final int $stable = 0;
        public static final Empty INSTANCE = new Empty();

        private Empty() {
            super(null);
        }
    }

    /* compiled from: MRKMRDataUiState.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\n\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\bJ\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u0001HÆ\u0001¢\u0006\u0002\u0010\fJ\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004R\u0013\u0010\u0004\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b¨\u0006\u0014"}, d2 = {"Lgbcorp/c312/merkmarker/info/ui/state/MRKMRDataUiState$Populated;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lgbcorp/c312/merkmarker/info/ui/state/MRKMRDataUiState;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lgbcorp/c312/merkmarker/info/ui/state/MRKMRDataUiState$Populated;", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Populated<T> extends MRKMRDataUiState<T> {
        public static final int $stable = 0;
        private final T data;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Populated copy$default(Populated populated, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = populated.data;
            }
            return populated.copy(obj);
        }

        public final T component1() {
            return this.data;
        }

        public final Populated<T> copy(T data) {
            Intrinsics.checkNotNullParameter(data, "data");
            return new Populated<>(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Populated) && Intrinsics.areEqual(this.data, ((Populated) other).data);
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "Populated(data=" + this.data + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Populated(T data) {
            super(null);
            Intrinsics.checkNotNullParameter(data, "data");
            this.data = data;
        }

        public final T getData() {
            return this.data;
        }
    }

    /* compiled from: MRKMRDataUiState.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00070\u00060\u0005\"\u0004\b\u0001\u0010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006J%\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0005\"\b\b\u0001\u0010\u0007*\u00020\u00012\b\u0010\t\u001a\u0004\u0018\u0001H\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lgbcorp/c312/merkmarker/info/ui/state/MRKMRDataUiState$Companion;", "", "<init>", "()V", "from", "Lgbcorp/c312/merkmarker/info/ui/state/MRKMRDataUiState;", "", ExifInterface.GPS_DIRECTION_TRUE, "list", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Object;)Lgbcorp/c312/merkmarker/info/ui/state/MRKMRDataUiState;", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final <T> MRKMRDataUiState<List<T>> from(List<? extends T> list) {
            Intrinsics.checkNotNullParameter(list, "list");
            return list.isEmpty() ? Empty.INSTANCE : new Populated<>(list);
        }

        public final <T> MRKMRDataUiState<T> from(T data) {
            return data == null ? Empty.INSTANCE : new Populated<>(data);
        }
    }
}
