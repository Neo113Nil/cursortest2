package com.moyoung.lib.ai.chat;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/* loaded from: classes4.dex */
public class c {
    private static final String SYSTEM_MESSAGE_CONTENT = "你是一个有帮助的助手，请对用户的输入给出合适的回应。不要回复得太简洁了。";
    private int maxMsgCount = 20;
    private boolean isCurrentMsgFromWatch = false;
    private final b queueManager = new b();

    private class b {
        private final Queue<com.moyoung.lib.ai.chat.b> msgQueue;
        private final Queue<com.moyoung.lib.ai.chat.b> watchMsgQueue;

        private b() {
            this.msgQueue = new LinkedList();
            this.watchMsgQueue = new LinkedList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Queue<com.moyoung.lib.ai.chat.b> getCurrentQueue() {
            return c.this.isCurrentMsgFromWatch ? this.watchMsgQueue : this.msgQueue;
        }

        private Queue<com.moyoung.lib.ai.chat.b> getQueue(boolean z7) {
            return z7 ? this.watchMsgQueue : this.msgQueue;
        }

        public synchronized void addMessage(com.moyoung.lib.ai.chat.b bVar) {
            try {
                Queue<com.moyoung.lib.ai.chat.b> currentQueue = getCurrentQueue();
                if (currentQueue.size() >= c.this.maxMsgCount) {
                    currentQueue.poll();
                }
                currentQueue.offer(bVar);
            } catch (Throwable th) {
                throw th;
            }
        }

        public void clear() {
            this.msgQueue.clear();
            this.watchMsgQueue.clear();
        }

        public com.moyoung.lib.ai.chat.b getFirstMessage() {
            return getCurrentQueue().peek();
        }

        public boolean isEmpty() {
            return getCurrentQueue().isEmpty();
        }

        public com.moyoung.lib.ai.chat.b removeLastMsg() {
            Queue<com.moyoung.lib.ai.chat.b> currentQueue = getCurrentQueue();
            if (currentQueue.isEmpty()) {
                return null;
            }
            ArrayList arrayList = new ArrayList(currentQueue);
            currentQueue.clear();
            com.moyoung.lib.ai.chat.b bVar = (com.moyoung.lib.ai.chat.b) arrayList.remove(arrayList.size() - 1);
            currentQueue.addAll(arrayList);
            return bVar;
        }
    }

    private boolean isSystemMessage(com.moyoung.lib.ai.chat.b bVar) {
        return bVar != null && "system".equals(bVar.role);
    }

    public void addAssistantMsg(String str) {
        this.queueManager.addMessage(new com.moyoung.lib.ai.chat.b(String.valueOf(System.currentTimeMillis()), com.moyoung.lib.ai.chat.b.ROLE_ASSISTANT, str));
    }

    public void addUserMsg(String str) {
        this.queueManager.addMessage(new com.moyoung.lib.ai.chat.b(String.valueOf(System.currentTimeMillis()), com.moyoung.lib.ai.chat.b.ROLE_USER, str));
    }

    public void clear() {
        this.queueManager.clear();
    }

    public boolean isCurrentMsgFromWatch() {
        return this.isCurrentMsgFromWatch;
    }

    public com.moyoung.lib.ai.chat.b removeLastMsg() {
        return this.queueManager.removeLastMsg();
    }

    public void setCurrentMsgFromWatch(boolean z7) {
        this.isCurrentMsgFromWatch = z7;
    }

    public void setMaxMsgCount(int i8) {
        this.maxMsgCount = i8;
    }

    public JsonArray toJsonArray() {
        JsonArray jsonArray = new JsonArray();
        if (this.queueManager.isEmpty() || !isSystemMessage(this.queueManager.getFirstMessage())) {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("role", "system");
            jsonObject.addProperty(FirebaseAnalytics.Param.CONTENT, SYSTEM_MESSAGE_CONTENT);
            jsonArray.add(jsonObject);
        }
        for (com.moyoung.lib.ai.chat.b bVar : this.queueManager.getCurrentQueue()) {
            JsonObject jsonObject2 = new JsonObject();
            jsonObject2.addProperty("role", bVar.role);
            jsonObject2.addProperty(FirebaseAnalytics.Param.CONTENT, bVar.content);
            jsonArray.add(jsonObject2);
        }
        return jsonArray;
    }
}
