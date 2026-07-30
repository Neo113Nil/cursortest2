package x1;

import com.crrepa.band.my.device.watchface.model.StoreWatchFaceTagBean;
import java.util.List;

/* loaded from: classes2.dex */
public interface d {
    void renderBandDisconnect(int i8);

    void renderInsufficientStorage();

    void renderNetError();

    void renderWatchFaceLoadComplete();

    void renderWatchFaceLoadEnd();

    void renderWatchFaceTagList(List<StoreWatchFaceTagBean> list);
}
