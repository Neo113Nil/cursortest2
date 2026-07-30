package androidx.constraintlayout.core.dsl;

import com.baidu.ar.util.SystemInfoUtil;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class Constraint {
    public static final Constraint PARENT = new Constraint("parent");
    static int UNSET = Integer.MIN_VALUE;
    static Map<ChainMode, String> chainModeMap;
    private float mCircleAngle;
    private String mCircleConstraint;
    private int mCircleRadius;
    private boolean mConstrainedHeight;
    private boolean mConstrainedWidth;
    private String mDimensionRatio;
    private int mEditorAbsoluteX;
    private int mEditorAbsoluteY;
    private int mHeight;
    private Behaviour mHeightDefault;
    private int mHeightMax;
    private int mHeightMin;
    private float mHeightPercent;
    private float mHorizontalBias;
    private ChainMode mHorizontalChainStyle;
    private float mHorizontalWeight;
    private final String mId;
    private String[] mReferenceIds;
    private float mVerticalBias;
    private ChainMode mVerticalChainStyle;
    private float mVerticalWeight;
    private int mWidth;
    private Behaviour mWidthDefault;
    private int mWidthMax;
    private int mWidthMin;
    private float mWidthPercent;
    String helperType = null;
    String helperJason = null;
    private HAnchor mLeft = new HAnchor(HSide.LEFT);
    private HAnchor mRight = new HAnchor(HSide.RIGHT);
    private VAnchor mTop = new VAnchor(VSide.TOP);
    private VAnchor mBottom = new VAnchor(VSide.BOTTOM);
    private HAnchor mStart = new HAnchor(HSide.START);
    private HAnchor mEnd = new HAnchor(HSide.END);
    private VAnchor mBaseline = new VAnchor(VSide.BASELINE);

    public class Anchor {
        Anchor mConnection = null;
        int mGoneMargin = Integer.MIN_VALUE;
        int mMargin;
        final Side mSide;

        Anchor(Side side) {
            this.mSide = side;
        }

        public void build(StringBuilder sb) {
            if (this.mConnection != null) {
                sb.append(this.mSide.toString().toLowerCase());
                sb.append(":");
                sb.append(this);
                sb.append(",\n");
            }
        }

        public String getId() {
            return Constraint.this.mId;
        }

        Constraint getParent() {
            return Constraint.this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("[");
            if (this.mConnection != null) {
                sb.append("'");
                sb.append(this.mConnection.getId());
                sb.append("',");
                sb.append("'");
                sb.append(this.mConnection.mSide.toString().toLowerCase());
                sb.append("'");
            }
            if (this.mMargin != 0) {
                sb.append(SystemInfoUtil.COMMA);
                sb.append(this.mMargin);
            }
            if (this.mGoneMargin != Integer.MIN_VALUE) {
                if (this.mMargin == 0) {
                    sb.append(",0,");
                    sb.append(this.mGoneMargin);
                } else {
                    sb.append(SystemInfoUtil.COMMA);
                    sb.append(this.mGoneMargin);
                }
            }
            sb.append("]");
            return sb.toString();
        }
    }

    public enum Behaviour {
        SPREAD,
        WRAP,
        PERCENT,
        RATIO,
        RESOLVED
    }

    public enum ChainMode {
        SPREAD,
        SPREAD_INSIDE,
        PACKED
    }

    public class HAnchor extends Anchor {
        HAnchor(HSide hSide) {
            super(Side.valueOf(hSide.name()));
        }
    }

    public enum HSide {
        LEFT,
        RIGHT,
        START,
        END
    }

    public enum Side {
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        START,
        END,
        BASELINE
    }

    public class VAnchor extends Anchor {
        VAnchor(VSide vSide) {
            super(Side.valueOf(vSide.name()));
        }
    }

    public enum VSide {
        TOP,
        BOTTOM,
        BASELINE
    }

    static {
        HashMap hashMap = new HashMap();
        chainModeMap = hashMap;
        hashMap.put(ChainMode.SPREAD, "spread");
        chainModeMap.put(ChainMode.SPREAD_INSIDE, "spread_inside");
        chainModeMap.put(ChainMode.PACKED, "packed");
    }

    public Constraint(String str) {
        int i8 = UNSET;
        this.mWidth = i8;
        this.mHeight = i8;
        this.mHorizontalBias = Float.NaN;
        this.mVerticalBias = Float.NaN;
        this.mDimensionRatio = null;
        this.mCircleConstraint = null;
        this.mCircleRadius = Integer.MIN_VALUE;
        this.mCircleAngle = Float.NaN;
        this.mEditorAbsoluteX = Integer.MIN_VALUE;
        this.mEditorAbsoluteY = Integer.MIN_VALUE;
        this.mVerticalWeight = Float.NaN;
        this.mHorizontalWeight = Float.NaN;
        this.mHorizontalChainStyle = null;
        this.mVerticalChainStyle = null;
        this.mWidthDefault = null;
        this.mHeightDefault = null;
        this.mWidthMax = i8;
        this.mHeightMax = i8;
        this.mWidthMin = i8;
        this.mHeightMin = i8;
        this.mWidthPercent = Float.NaN;
        this.mHeightPercent = Float.NaN;
        this.mReferenceIds = null;
        this.mConstrainedWidth = false;
        this.mConstrainedHeight = false;
        this.mId = str;
    }

    protected void append(StringBuilder sb, String str, float f8) {
        if (Float.isNaN(f8)) {
            return;
        }
        sb.append(str);
        sb.append(":");
        sb.append(f8);
        sb.append(",\n");
    }

    public String convertStringArrayToString(String[] strArr) {
        StringBuilder sb = new StringBuilder("[");
        int i8 = 0;
        while (i8 < strArr.length) {
            sb.append(i8 == 0 ? "'" : ",'");
            sb.append(strArr[i8]);
            sb.append("'");
            i8++;
        }
        sb.append("]");
        return sb.toString();
    }

    public VAnchor getBaseline() {
        return this.mBaseline;
    }

    public VAnchor getBottom() {
        return this.mBottom;
    }

    public float getCircleAngle() {
        return this.mCircleAngle;
    }

    public String getCircleConstraint() {
        return this.mCircleConstraint;
    }

    public int getCircleRadius() {
        return this.mCircleRadius;
    }

    public String getDimensionRatio() {
        return this.mDimensionRatio;
    }

    public int getEditorAbsoluteX() {
        return this.mEditorAbsoluteX;
    }

    public int getEditorAbsoluteY() {
        return this.mEditorAbsoluteY;
    }

    public HAnchor getEnd() {
        return this.mEnd;
    }

    public int getHeight() {
        return this.mHeight;
    }

    public Behaviour getHeightDefault() {
        return this.mHeightDefault;
    }

    public int getHeightMax() {
        return this.mHeightMax;
    }

    public int getHeightMin() {
        return this.mHeightMin;
    }

    public float getHeightPercent() {
        return this.mHeightPercent;
    }

    public float getHorizontalBias() {
        return this.mHorizontalBias;
    }

    public ChainMode getHorizontalChainStyle() {
        return this.mHorizontalChainStyle;
    }

    public float getHorizontalWeight() {
        return this.mHorizontalWeight;
    }

    public HAnchor getLeft() {
        return this.mLeft;
    }

    public String[] getReferenceIds() {
        return this.mReferenceIds;
    }

    public HAnchor getRight() {
        return this.mRight;
    }

    public HAnchor getStart() {
        return this.mStart;
    }

    public VAnchor getTop() {
        return this.mTop;
    }

    public float getVerticalBias() {
        return this.mVerticalBias;
    }

    public ChainMode getVerticalChainStyle() {
        return this.mVerticalChainStyle;
    }

    public float getVerticalWeight() {
        return this.mVerticalWeight;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public Behaviour getWidthDefault() {
        return this.mWidthDefault;
    }

    public int getWidthMax() {
        return this.mWidthMax;
    }

    public int getWidthMin() {
        return this.mWidthMin;
    }

    public float getWidthPercent() {
        return this.mWidthPercent;
    }

    public boolean isConstrainedHeight() {
        return this.mConstrainedHeight;
    }

    public boolean isConstrainedWidth() {
        return this.mConstrainedWidth;
    }

    public void linkToBaseline(VAnchor vAnchor) {
        linkToBaseline(vAnchor, 0);
    }

    public void linkToBottom(VAnchor vAnchor) {
        linkToBottom(vAnchor, 0);
    }

    public void linkToEnd(HAnchor hAnchor) {
        linkToEnd(hAnchor, 0);
    }

    public void linkToLeft(HAnchor hAnchor) {
        linkToLeft(hAnchor, 0);
    }

    public void linkToRight(HAnchor hAnchor) {
        linkToRight(hAnchor, 0);
    }

    public void linkToStart(HAnchor hAnchor) {
        linkToStart(hAnchor, 0);
    }

    public void linkToTop(VAnchor vAnchor) {
        linkToTop(vAnchor, 0);
    }

    public void setCircleAngle(float f8) {
        this.mCircleAngle = f8;
    }

    public void setCircleConstraint(String str) {
        this.mCircleConstraint = str;
    }

    public void setCircleRadius(int i8) {
        this.mCircleRadius = i8;
    }

    public void setConstrainedHeight(boolean z7) {
        this.mConstrainedHeight = z7;
    }

    public void setConstrainedWidth(boolean z7) {
        this.mConstrainedWidth = z7;
    }

    public void setDimensionRatio(String str) {
        this.mDimensionRatio = str;
    }

    public void setEditorAbsoluteX(int i8) {
        this.mEditorAbsoluteX = i8;
    }

    public void setEditorAbsoluteY(int i8) {
        this.mEditorAbsoluteY = i8;
    }

    public void setHeight(int i8) {
        this.mHeight = i8;
    }

    public void setHeightDefault(Behaviour behaviour) {
        this.mHeightDefault = behaviour;
    }

    public void setHeightMax(int i8) {
        this.mHeightMax = i8;
    }

    public void setHeightMin(int i8) {
        this.mHeightMin = i8;
    }

    public void setHeightPercent(float f8) {
        this.mHeightPercent = f8;
    }

    public void setHorizontalBias(float f8) {
        this.mHorizontalBias = f8;
    }

    public void setHorizontalChainStyle(ChainMode chainMode) {
        this.mHorizontalChainStyle = chainMode;
    }

    public void setHorizontalWeight(float f8) {
        this.mHorizontalWeight = f8;
    }

    public void setReferenceIds(String[] strArr) {
        this.mReferenceIds = strArr;
    }

    public void setVerticalBias(float f8) {
        this.mVerticalBias = f8;
    }

    public void setVerticalChainStyle(ChainMode chainMode) {
        this.mVerticalChainStyle = chainMode;
    }

    public void setVerticalWeight(float f8) {
        this.mVerticalWeight = f8;
    }

    public void setWidth(int i8) {
        this.mWidth = i8;
    }

    public void setWidthDefault(Behaviour behaviour) {
        this.mWidthDefault = behaviour;
    }

    public void setWidthMax(int i8) {
        this.mWidthMax = i8;
    }

    public void setWidthMin(int i8) {
        this.mWidthMin = i8;
    }

    public void setWidthPercent(float f8) {
        this.mWidthPercent = f8;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(this.mId + ":{\n");
        this.mLeft.build(sb);
        this.mRight.build(sb);
        this.mTop.build(sb);
        this.mBottom.build(sb);
        this.mStart.build(sb);
        this.mEnd.build(sb);
        this.mBaseline.build(sb);
        if (this.mWidth != UNSET) {
            sb.append("width:");
            sb.append(this.mWidth);
            sb.append(",\n");
        }
        if (this.mHeight != UNSET) {
            sb.append("height:");
            sb.append(this.mHeight);
            sb.append(",\n");
        }
        append(sb, "horizontalBias", this.mHorizontalBias);
        append(sb, "verticalBias", this.mVerticalBias);
        if (this.mDimensionRatio != null) {
            sb.append("dimensionRatio:'");
            sb.append(this.mDimensionRatio);
            sb.append("',\n");
        }
        if (this.mCircleConstraint != null && (!Float.isNaN(this.mCircleAngle) || this.mCircleRadius != Integer.MIN_VALUE)) {
            sb.append("circular:['");
            sb.append(this.mCircleConstraint);
            sb.append("'");
            if (!Float.isNaN(this.mCircleAngle)) {
                sb.append(SystemInfoUtil.COMMA);
                sb.append(this.mCircleAngle);
            }
            if (this.mCircleRadius != Integer.MIN_VALUE) {
                if (Float.isNaN(this.mCircleAngle)) {
                    sb.append(",0,");
                    sb.append(this.mCircleRadius);
                } else {
                    sb.append(SystemInfoUtil.COMMA);
                    sb.append(this.mCircleRadius);
                }
            }
            sb.append("],\n");
        }
        append(sb, "verticalWeight", this.mVerticalWeight);
        append(sb, "horizontalWeight", this.mHorizontalWeight);
        if (this.mHorizontalChainStyle != null) {
            sb.append("horizontalChainStyle:'");
            sb.append(chainModeMap.get(this.mHorizontalChainStyle));
            sb.append("',\n");
        }
        if (this.mVerticalChainStyle != null) {
            sb.append("verticalChainStyle:'");
            sb.append(chainModeMap.get(this.mVerticalChainStyle));
            sb.append("',\n");
        }
        if (this.mWidthDefault != null) {
            int i8 = this.mWidthMax;
            int i9 = UNSET;
            if (i8 == i9 && this.mWidthMin == i9) {
                sb.append("width:'");
                sb.append(this.mWidthDefault.toString().toLowerCase());
                sb.append("',\n");
            } else {
                sb.append("width:{value:'");
                sb.append(this.mWidthDefault.toString().toLowerCase());
                sb.append("'");
                if (this.mWidthMax != UNSET) {
                    sb.append(",max:");
                    sb.append(this.mWidthMax);
                }
                if (this.mWidthMin != UNSET) {
                    sb.append(",min:");
                    sb.append(this.mWidthMin);
                }
                sb.append("},\n");
            }
        }
        if (this.mHeightDefault != null) {
            int i10 = this.mHeightMax;
            int i11 = UNSET;
            if (i10 == i11 && this.mHeightMin == i11) {
                sb.append("height:'");
                sb.append(this.mHeightDefault.toString().toLowerCase());
                sb.append("',\n");
            } else {
                sb.append("height:{value:'");
                sb.append(this.mHeightDefault.toString().toLowerCase());
                sb.append("'");
                if (this.mHeightMax != UNSET) {
                    sb.append(",max:");
                    sb.append(this.mHeightMax);
                }
                if (this.mHeightMin != UNSET) {
                    sb.append(",min:");
                    sb.append(this.mHeightMin);
                }
                sb.append("},\n");
            }
        }
        if (!Double.isNaN(this.mWidthPercent)) {
            sb.append("width:'");
            sb.append((int) this.mWidthPercent);
            sb.append("%',\n");
        }
        if (!Double.isNaN(this.mHeightPercent)) {
            sb.append("height:'");
            sb.append((int) this.mHeightPercent);
            sb.append("%',\n");
        }
        if (this.mReferenceIds != null) {
            sb.append("referenceIds:");
            sb.append(convertStringArrayToString(this.mReferenceIds));
            sb.append(",\n");
        }
        if (this.mConstrainedWidth) {
            sb.append("constrainedWidth:");
            sb.append(this.mConstrainedWidth);
            sb.append(",\n");
        }
        if (this.mConstrainedHeight) {
            sb.append("constrainedHeight:");
            sb.append(this.mConstrainedHeight);
            sb.append(",\n");
        }
        sb.append("},\n");
        return sb.toString();
    }

    public void linkToBaseline(VAnchor vAnchor, int i8) {
        linkToBaseline(vAnchor, i8, Integer.MIN_VALUE);
    }

    public void linkToBottom(VAnchor vAnchor, int i8) {
        linkToBottom(vAnchor, i8, Integer.MIN_VALUE);
    }

    public void linkToEnd(HAnchor hAnchor, int i8) {
        linkToEnd(hAnchor, i8, Integer.MIN_VALUE);
    }

    public void linkToLeft(HAnchor hAnchor, int i8) {
        linkToLeft(hAnchor, i8, Integer.MIN_VALUE);
    }

    public void linkToRight(HAnchor hAnchor, int i8) {
        linkToRight(hAnchor, i8, Integer.MIN_VALUE);
    }

    public void linkToStart(HAnchor hAnchor, int i8) {
        linkToStart(hAnchor, i8, Integer.MIN_VALUE);
    }

    public void linkToTop(VAnchor vAnchor, int i8) {
        linkToTop(vAnchor, i8, Integer.MIN_VALUE);
    }

    public void linkToBaseline(VAnchor vAnchor, int i8, int i9) {
        VAnchor vAnchor2 = this.mBaseline;
        vAnchor2.mConnection = vAnchor;
        vAnchor2.mMargin = i8;
        vAnchor2.mGoneMargin = i9;
    }

    public void linkToBottom(VAnchor vAnchor, int i8, int i9) {
        VAnchor vAnchor2 = this.mBottom;
        vAnchor2.mConnection = vAnchor;
        vAnchor2.mMargin = i8;
        vAnchor2.mGoneMargin = i9;
    }

    public void linkToEnd(HAnchor hAnchor, int i8, int i9) {
        HAnchor hAnchor2 = this.mEnd;
        hAnchor2.mConnection = hAnchor;
        hAnchor2.mMargin = i8;
        hAnchor2.mGoneMargin = i9;
    }

    public void linkToLeft(HAnchor hAnchor, int i8, int i9) {
        HAnchor hAnchor2 = this.mLeft;
        hAnchor2.mConnection = hAnchor;
        hAnchor2.mMargin = i8;
        hAnchor2.mGoneMargin = i9;
    }

    public void linkToRight(HAnchor hAnchor, int i8, int i9) {
        HAnchor hAnchor2 = this.mRight;
        hAnchor2.mConnection = hAnchor;
        hAnchor2.mMargin = i8;
        hAnchor2.mGoneMargin = i9;
    }

    public void linkToStart(HAnchor hAnchor, int i8, int i9) {
        HAnchor hAnchor2 = this.mStart;
        hAnchor2.mConnection = hAnchor;
        hAnchor2.mMargin = i8;
        hAnchor2.mGoneMargin = i9;
    }

    public void linkToTop(VAnchor vAnchor, int i8, int i9) {
        VAnchor vAnchor2 = this.mTop;
        vAnchor2.mConnection = vAnchor;
        vAnchor2.mMargin = i8;
        vAnchor2.mGoneMargin = i9;
    }
}
