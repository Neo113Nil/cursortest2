package com.chad.library.adapter.base.entity;

/* loaded from: classes2.dex */
public interface SectionEntity extends MultiItemEntity {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final int HEADER_TYPE = -99;
    public static final int NORMAL_TYPE = -100;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int HEADER_TYPE = -99;
        public static final int NORMAL_TYPE = -100;

        private Companion() {
        }
    }

    @Override // com.chad.library.adapter.base.entity.MultiItemEntity
    int getItemType();

    boolean isHeader();
}
