package me.yokeyword.indexablerv;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import me.yokeyword.indexablerecyclerview.R$array;

/* loaded from: classes5.dex */
class c extends View {
    private ArrayList<b> mDatas;
    private Paint mFocusPaint;
    private float mIndexHeight;
    private List<String> mIndexList;
    private HashMap<String, Integer> mMapping;
    private Paint mPaint;
    private int mSelectionPosition;
    private float mTextSpace;
    private int mTotalHeight;

    public c(Context context) {
        super(context);
        this.mIndexList = new ArrayList();
        this.mMapping = new HashMap<>();
        this.mPaint = new Paint(1);
        this.mFocusPaint = new Paint(1);
    }

    int getFirstRecyclerViewPositionBySelection() {
        String str = this.mIndexList.get(this.mSelectionPosition);
        if (this.mMapping.containsKey(str)) {
            return this.mMapping.get(str).intValue();
        }
        return -1;
    }

    List<String> getIndexList() {
        return this.mIndexList;
    }

    int getPositionForPointY(float f8) {
        if (this.mIndexList.size() <= 0) {
            return -1;
        }
        int i8 = (int) (f8 / this.mIndexHeight);
        if (i8 < 0) {
            return 0;
        }
        return i8 > this.mIndexList.size() + (-1) ? this.mIndexList.size() - 1 : i8;
    }

    int getSelectionPosition() {
        return this.mSelectionPosition;
    }

    void init(Drawable drawable, int i8, int i9, float f8, float f9) {
        setBackground(drawable);
        this.mTextSpace = f9;
        this.mPaint.setColor(i8);
        Paint paint = this.mPaint;
        Paint.Align align = Paint.Align.CENTER;
        paint.setTextAlign(align);
        this.mPaint.setTextSize(f8);
        this.mFocusPaint.setTextAlign(align);
        this.mFocusPaint.setTextSize(f8 + ((int) TypedValue.applyDimension(1, 1.0f, getResources().getDisplayMetrics())));
        this.mFocusPaint.setColor(i9);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.mIndexList.size() == 0) {
            return;
        }
        this.mIndexHeight = getHeight() / this.mIndexList.size();
        for (int i8 = 0; i8 < this.mIndexList.size(); i8++) {
            if (this.mSelectionPosition == i8) {
                String str = this.mIndexList.get(i8);
                float width = getWidth() / 2;
                float f8 = this.mIndexHeight;
                canvas.drawText(str, width, (0.85f * f8) + (f8 * i8), this.mFocusPaint);
            } else {
                String str2 = this.mIndexList.get(i8);
                float width2 = getWidth() / 2;
                float f9 = this.mIndexHeight;
                canvas.drawText(str2, width2, (0.85f * f9) + (f9 * i8), this.mPaint);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i8, int i9) {
        View.MeasureSpec.getMode(i8);
        int size = View.MeasureSpec.getSize(i9);
        if (this.mIndexList.size() > 0) {
            this.mTotalHeight = (int) (((this.mIndexList.size() - 1) * this.mPaint.getTextSize()) + this.mFocusPaint.getTextSize() + ((this.mIndexList.size() + 1) * this.mTextSpace));
        }
        if (this.mTotalHeight > size) {
            this.mTotalHeight = size;
        }
        super.onMeasure(i8, View.MeasureSpec.makeMeasureSpec(this.mTotalHeight, 1073741824));
    }

    void setDatas(boolean z7, ArrayList<b> arrayList) {
        ArrayList arrayList2;
        this.mDatas = arrayList;
        this.mIndexList.clear();
        this.mMapping.clear();
        if (z7) {
            this.mIndexList = Arrays.asList(getResources().getStringArray(R$array.indexable_letter));
            this.mIndexList = new ArrayList(this.mIndexList);
            arrayList2 = new ArrayList();
        } else {
            arrayList2 = null;
        }
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            b bVar = arrayList.get(i8);
            if (bVar.getItemType() == 2147483646 || bVar.getIndexTitle() == null) {
                String index = bVar.getIndex();
                if (!TextUtils.isEmpty(index)) {
                    if (!z7) {
                        this.mIndexList.add(index);
                    } else if ("#".equals(index)) {
                        this.mIndexList.add("#");
                    } else if (this.mIndexList.indexOf(index) < 0) {
                        if (bVar.getHeaderFooterType() == 1 && arrayList2.indexOf(index) < 0) {
                            arrayList2.add(index);
                        } else if (bVar.getHeaderFooterType() == 2) {
                            this.mIndexList.add(index);
                        }
                    }
                    if (!this.mMapping.containsKey(index)) {
                        this.mMapping.put(index, Integer.valueOf(i8));
                    }
                }
            }
        }
        if (z7) {
            this.mIndexList.addAll(0, arrayList2);
        }
        requestLayout();
    }

    void setSelection(int i8) {
        ArrayList<b> arrayList = this.mDatas;
        if (arrayList == null || arrayList.size() <= i8 || i8 < 0) {
            return;
        }
        int indexOf = this.mIndexList.indexOf(this.mDatas.get(i8).getIndex());
        if (this.mSelectionPosition == indexOf || indexOf < 0) {
            return;
        }
        this.mSelectionPosition = indexOf;
        invalidate();
    }

    void setSelectionPosition(int i8) {
        this.mSelectionPosition = i8;
        invalidate();
    }
}
