package com.youappi.sdk.utils;

import com.google.android.gms.games.GamesStatusCodes;
import com.youappi.sdk.net.model.vast.MediaFileItem;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes2.dex */
public class e {
    private static MediaFileItem a(List<MediaFileItem> list, int i) {
        MediaFileItem mediaFileItem = list.get(0);
        for (MediaFileItem mediaFileItem2 : list) {
            if (Math.abs(mediaFileItem2.getBitrate() - i) < Math.abs(mediaFileItem.getBitrate() - i)) {
                mediaFileItem = mediaFileItem2;
            }
        }
        return mediaFileItem;
    }

    public static MediaFileItem a(List<MediaFileItem> list, int i, int i2, int i3) {
        if (list.size() == 0) {
            return null;
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        LinkedList linkedList = new LinkedList();
        int max = Math.max(i2, i);
        int min = Math.min(i2, i);
        for (MediaFileItem mediaFileItem : list) {
            int max2 = Math.max(mediaFileItem.getHeight(), mediaFileItem.getWidth());
            int min2 = Math.min(mediaFileItem.getHeight(), mediaFileItem.getWidth());
            if (max2 <= max && min2 <= min) {
                linkedList.add(mediaFileItem);
            }
        }
        if (linkedList.size() != 0) {
            list = linkedList;
        }
        return a(list, i3 == 1 ? GamesStatusCodes.STATUS_ACHIEVEMENT_UNLOCK_FAILURE : 1500);
    }
}
