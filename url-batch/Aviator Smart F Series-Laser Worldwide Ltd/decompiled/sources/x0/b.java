package x0;

import com.crrepa.band.my.model.ContactModel;
import com.crrepa.band.my.model.db.Contact;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public interface b {
    void renderContactList(List<ContactModel> list);

    void renderMaxSelectContactCountHint(int i8);

    void renderSeleceContactCount(int i8);

    void renderSelectedContactList(ArrayList<Contact> arrayList, String str);
}
