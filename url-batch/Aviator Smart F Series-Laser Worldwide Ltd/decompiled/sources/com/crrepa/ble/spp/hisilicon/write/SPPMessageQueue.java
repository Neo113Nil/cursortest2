package com.crrepa.ble.spp.hisilicon.write;

import com.crrepa.ble.util.BleLog;
import java.util.LinkedList;

/* loaded from: classes3.dex */
public class SPPMessageQueue {
    private final LinkedList<SPPMessage> messageQueue = new LinkedList<>();
    private final LinkedList<SPPMessage> svgQueue = new LinkedList<>();

    public void clear() {
        this.messageQueue.clear();
        this.svgQueue.clear();
    }

    public synchronized SPPMessage get() {
        try {
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (!this.messageQueue.isEmpty()) {
            return this.messageQueue.remove(0);
        }
        if (!this.svgQueue.isEmpty()) {
            return this.svgQueue.remove(0);
        }
        return null;
    }

    public synchronized void insert(SPPMessage sPPMessage) {
        String str;
        try {
            BleLog.d("spp message insert: " + sPPMessage.getType());
            if (sPPMessage.getType() == HisiliconFileType.MAP_SVG) {
                this.svgQueue.add(sPPMessage);
                str = "spp svgQueue size: " + this.svgQueue.size();
            } else {
                this.messageQueue.add(sPPMessage);
                str = "messageQueue svgQueue size: " + this.messageQueue.size();
            }
            BleLog.d(str);
        } catch (Throwable th) {
            throw th;
        }
    }
}
