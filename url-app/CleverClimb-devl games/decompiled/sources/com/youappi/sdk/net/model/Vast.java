package com.youappi.sdk.net.model;

import com.youappi.sdk.net.model.vast.MediaFileItem;
import com.youappi.sdk.utils.h;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/* loaded from: classes2.dex */
public class Vast {
    private VastCarriageObject parent;
    private Queue<Inline> inlines = new LinkedList();
    private Queue<Wrapper> wrappers = new LinkedList();

    public static class Inline extends VastCarriageObject implements Serializable {
        private String clickThroughUrl;
        private int duration;
        private LinkedList<MediaFileItem> mediaFiles = new LinkedList<>();

        public String getClickThroughUrl() {
            return this.clickThroughUrl;
        }

        public int getDuration() {
            return this.duration;
        }

        public LinkedList<MediaFileItem> getMediaFiles() {
            return this.mediaFiles;
        }

        public boolean hasLinear() {
            return this.mediaFiles != null;
        }

        public void setClickThroughUrl(String str) {
            this.clickThroughUrl = str;
        }

        public void setDuration(int i) {
            this.duration = i;
        }

        public void setMediaFiles(LinkedList<MediaFileItem> linkedList) {
            this.mediaFiles.addAll(linkedList);
        }
    }

    public static abstract class VastCarriageObject {
        private EventUrls eventUrls = new EventUrls();
        private VastCarriageObject father = null;

        private VastCarriageObject getParent() {
            return this.father;
        }

        private void merge(VastCarriageObject vastCarriageObject) {
            for (String str : vastCarriageObject.getEventUrls().keySet()) {
                if (this.eventUrls.get(str) == null) {
                    this.eventUrls.put(str, vastCarriageObject.getEventUrls().get(str));
                } else {
                    this.eventUrls.get(str).addAll(vastCarriageObject.getEventUrls().get(str));
                }
            }
        }

        public void addEvent(String str, final String str2) {
            if (this.eventUrls.containsKey(str)) {
                this.eventUrls.get(str).add(str2);
            } else {
                this.eventUrls.put(str, new ArrayList<String>() { // from class: com.youappi.sdk.net.model.Vast.VastCarriageObject.1
                    {
                        add(str2);
                    }
                });
            }
        }

        public void addEvents(String str, final List list) {
            if (str == null || list == null) {
                return;
            }
            if (this.eventUrls.containsKey(str)) {
                this.eventUrls.get(str).addAll(list);
            } else {
                this.eventUrls.put(str, new ArrayList<String>() { // from class: com.youappi.sdk.net.model.Vast.VastCarriageObject.2
                    {
                        addAll(list);
                    }
                });
            }
        }

        public void addEvents(HashMap<String, LinkedList<String>> hashMap) {
            for (String str : hashMap.keySet()) {
                addEvents(str, hashMap.get(str));
            }
        }

        public void carriage() {
            for (VastCarriageObject parent = getParent(); parent != null; parent = parent.getParent()) {
                merge(parent);
            }
        }

        public EventUrls getEventUrls() {
            return this.eventUrls;
        }

        public int getGeneration() {
            int i = 1;
            for (VastCarriageObject vastCarriageObject = this; vastCarriageObject.getParent() != null; vastCarriageObject = vastCarriageObject.getParent()) {
                i++;
            }
            return i;
        }

        public void setParent(VastCarriageObject vastCarriageObject) {
            this.father = vastCarriageObject;
        }
    }

    public static class Wrapper extends VastCarriageObject implements Serializable {
        private String wrapperUrl;

        public String getWrapperUrl() {
            return this.wrapperUrl;
        }

        public void setWrapperUrl(String str) {
            this.wrapperUrl = str;
        }
    }

    Vast(String str, VastCarriageObject vastCarriageObject) {
        this.parent = vastCarriageObject;
    }

    public boolean empty() {
        return this.inlines.size() == 0 && this.wrappers.size() == 0;
    }

    public void insertInline(Inline inline) {
        this.inlines.add(inline);
    }

    public void insertWrapper(Wrapper wrapper) {
        this.wrappers.add(wrapper);
    }

    public boolean make(String str) {
        return new h(this.parent).a(str, this);
    }

    public Inline popInline() {
        return this.inlines.poll();
    }

    public Wrapper popWrapper() {
        return this.wrappers.poll();
    }
}
