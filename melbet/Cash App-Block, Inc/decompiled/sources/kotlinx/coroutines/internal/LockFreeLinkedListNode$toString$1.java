package kotlinx.coroutines.internal;

import androidx.compose.runtime.State;
import com.squareup.protos.cash.messagingplatformcommon.app.ImageFill;
import com.squareup.protos.cash.messagingplatformcommon.app.ImageFixed;
import com.squareup.protos.cash.messagingplatformcommon.app.ImageInset;
import kotlin.jvm.internal.PropertyReference0;
import kotlinx.coroutines.JobKt;

/* loaded from: classes7.dex */
public final /* synthetic */ class LockFreeLinkedListNode$toString$1 extends PropertyReference0 {
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LockFreeLinkedListNode$toString$1(LockFreeLinkedListNode lockFreeLinkedListNode) {
        super(lockFreeLinkedListNode, JobKt.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1);
        this.$r8$classId = 0;
    }

    @Override // kotlin.reflect.KProperty0
    public final Object get() {
        switch (this.$r8$classId) {
            case 0:
                return this.receiver.getClass().getSimpleName();
            case 1:
                return ((State) this.receiver).getValue();
            case 2:
                return ((State) this.receiver).getValue();
            case 3:
                return ((State) this.receiver).getValue();
            case 4:
                return ((State) this.receiver).getValue();
            case 5:
                return ((State) this.receiver).getValue();
            case 6:
                return ((ImageInset) this.receiver).image_asset;
            case 7:
                return ((ImageInset) this.receiver).asset_url;
            case 8:
                return ((ImageFixed) this.receiver).image_asset;
            case 9:
                return ((ImageFixed) this.receiver).asset_url;
            case 10:
                return ((ImageFill) this.receiver).image_asset;
            default:
                return ((ImageFill) this.receiver).asset_url;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LockFreeLinkedListNode$toString$1(int i, int i2, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, i);
        this.$r8$classId = i2;
    }
}
