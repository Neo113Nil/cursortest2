package i1;

import com.crrepa.band.my.device.muslim.model.AllahName;
import com.crrepa.band.my.device.muslim.model.BandMuslimNameChangeEvent;
import com.crrepa.ble.conn.listener.CRPMuslimNameListener;
import com.orhanobut.logger.f;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class a implements CRPMuslimNameListener {
    private void updateAllahNameList(List<Integer> list) {
        List<AllahName> allahNameList = com.crrepa.band.my.device.muslim.utils.c.getAllahNameList();
        for (int i8 = 0; i8 < allahNameList.size(); i8++) {
            allahNameList.get(i8).setFavorite(false);
            Iterator<Integer> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (i8 == it.next().intValue()) {
                        allahNameList.get(i8).setFavorite(true);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        com.crrepa.band.my.device.muslim.utils.c.saveAllahNameList(allahNameList);
        org.greenrobot.eventbus.c.getDefault().post(new BandMuslimNameChangeEvent(false));
    }

    @Override // com.crrepa.ble.conn.listener.CRPMuslimNameListener
    public void onNameStateChange(boolean z7, List<Integer> list) {
        f.d("watch-muslim ==> nameChange-isFavorite : " + z7 + "; indexList : " + list);
        if (z7) {
            updateAllahNameList(list);
            return;
        }
        BandMuslimNameChangeEvent bandMuslimNameChangeEvent = new BandMuslimNameChangeEvent(true);
        bandMuslimNameChangeEvent.setIndexList(list);
        org.greenrobot.eventbus.c.getDefault().post(bandMuslimNameChangeEvent);
    }

    @Override // com.crrepa.ble.conn.listener.CRPMuslimNameListener
    public void onSavedNameChange(List<Integer> list) {
        f.d("watch-muslim ==> queryName-indexList : " + list);
        updateAllahNameList(list);
    }
}
