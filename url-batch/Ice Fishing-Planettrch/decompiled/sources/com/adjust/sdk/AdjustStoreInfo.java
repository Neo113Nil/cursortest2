package com.adjust.sdk;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public class AdjustStoreInfo {
    private static final ILogger logger = AdjustFactory.getLogger();
    String storeAppId;
    String storeName;

    public AdjustStoreInfo(String str) {
        if (isValidStore(str)) {
            this.storeName = str;
        }
    }

    private boolean isValidStore(String str) {
        if (str == null) {
            logger.error("Missing store name", new Object[0]);
            return false;
        }
        if (!str.isEmpty()) {
            return true;
        }
        logger.error("Store name can't be empty", new Object[0]);
        return false;
    }

    public void setStoreAppId(String str) {
        this.storeAppId = str;
    }
}
