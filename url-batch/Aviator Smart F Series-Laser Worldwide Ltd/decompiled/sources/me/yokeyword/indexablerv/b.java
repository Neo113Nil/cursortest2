package me.yokeyword.indexablerv;

/* loaded from: classes5.dex */
public class b {
    static final int TYPE_CONTENT = Integer.MAX_VALUE;
    static final int TYPE_FOOTER = 2;
    static final int TYPE_HEADER = 1;
    static final int TYPE_TITLE = 2147483646;
    private Object data;
    private int headerFooterType;
    private String index;
    private String indexByField;
    private String indexTitle;
    private int itemType;
    private int originalPosition;
    private String pinyin;

    b() {
        this.originalPosition = -1;
        this.itemType = Integer.MAX_VALUE;
    }

    public Object getData() {
        return this.data;
    }

    int getHeaderFooterType() {
        return this.headerFooterType;
    }

    public String getIndex() {
        return this.index;
    }

    public String getIndexByField() {
        return this.indexByField;
    }

    public String getIndexTitle() {
        return this.indexTitle;
    }

    int getItemType() {
        return this.itemType;
    }

    public int getOriginalPosition() {
        return this.originalPosition;
    }

    public String getPinyin() {
        return this.pinyin;
    }

    public boolean isContent() {
        return this.itemType == Integer.MAX_VALUE;
    }

    public boolean isFooter() {
        return this.headerFooterType == 2;
    }

    public boolean isHeader() {
        return this.headerFooterType == 1;
    }

    public boolean isTitle() {
        return this.itemType == TYPE_TITLE;
    }

    void setData(Object obj) {
        this.data = obj;
    }

    void setHeaderFooterType(int i8) {
        this.headerFooterType = i8;
    }

    void setIndex(String str) {
        this.index = str;
    }

    void setIndexByField(String str) {
        this.indexByField = str;
    }

    void setIndexTitle(String str) {
        this.indexTitle = str;
    }

    void setItemType(int i8) {
        this.itemType = i8;
    }

    void setOriginalPosition(int i8) {
        this.originalPosition = i8;
    }

    void setPinyin(String str) {
        this.pinyin = str;
    }

    b(String str, int i8) {
        this.originalPosition = -1;
        this.index = str;
        this.indexTitle = str;
        this.pinyin = str;
        this.itemType = i8;
    }
}
