package k1;

import com.crrepa.band.my.model.db.PillReminder;
import com.crrepa.band.my.model.db.proxy.PillReminderDaoProxy;
import com.moyoung.dafit.module.common.baseui.f;
import java.util.List;

/* loaded from: classes2.dex */
public class c implements f {
    private PillReminderDaoProxy pillReminderDaoProxy = new PillReminderDaoProxy();
    private l1.b view;

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
        this.view = null;
    }

    public void getPillReminderList() {
        List<PillReminder> all = this.pillReminderDaoProxy.getAll();
        if (all == null || all.isEmpty()) {
            this.view.renderEmptyReminder();
        } else {
            this.view.renderReminderList(all);
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void pause() {
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void resume() {
    }

    public void setView(l1.b bVar) {
        this.view = bVar;
    }
}
