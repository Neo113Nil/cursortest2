package x0;

import com.crrepa.band.my.model.db.Contact;
import java.util.List;

/* loaded from: classes2.dex */
public interface a {
    void renderBandDisconnected();

    void renderContactList(List<Contact> list);

    void renderContactListChanged(boolean z7);

    void renderLowBatteryHint();

    void renderMaxContactCount(int i8);

    void renderStartUploadContact();

    void renderUploadFail();

    void renderUploadProgress(int i8);

    void renderUploadSuccess();
}
