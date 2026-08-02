package net.oneformapp.schema;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.fillr.b2;
import com.fillr.core.model.ModelBase;
import com.fillr.f;
import com.fillr.m1;
import com.fillr.n0;
import com.fillr.o0;
import com.fillr.w;
import com.fillr.z;
import com.withpersona.sdk2.inquiry.nfc.ChipAuthenticationStatus;
import com.withpersona.sdk2.inquiry.steps.ui.components.utils.GovernmentIdNfcData;
import com.withpersona.sdk2.inquiry.steps.ui.mdoc.MdocRequestMetadata$GoogleWalletRequestMetadata;
import com.withpersona.sdk2.inquiry.steps.ui.mdoc.MdocRequestMetadata$IdType;
import com.withpersona.sdk2.inquiry.steps.ui.network.Suggestion;
import com.withpersona.sdk2.inquiry.types.collected_data.CollectedData;
import com.withpersona.sdk2.inquiry.types.collected_data.CollectedGovernmentIdDetails;
import com.withpersona.sdk2.inquiry.types.collected_data.DocumentFile;
import com.withpersona.sdk2.inquiry.types.collected_data.ErrorCode;
import com.withpersona.sdk2.inquiry.types.collected_data.GovernmentIdCapture;
import com.withpersona.sdk2.inquiry.types.collected_data.SelfieCapture;
import com.withpersona.sdk2.inquiry.types.collected_data.StepData;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow;
import com.withpersona.sdk2.inquiry.ui.network.ComponentParam;
import com.withpersona.sdk2.inquiry.ui.network.UiStepData;
import com.withpersona.sdk2.inquiry.ui.uiStep.UiStepFragment;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import javax.xml.namespace.QName;
import org.w3c.dom.Node;

/* loaded from: classes4.dex */
public final class Element extends ModelBase implements Serializable, Cloneable {
    public static final Parcelable.Creator<Element> CREATOR = new AnonymousClass1(0);
    public Annotation annotation;
    public List children;
    public boolean dashboardStat;
    public String displayName;
    public String elementName;
    public String elementTypeName;
    public String elementValue;
    public int firstYear;
    public String formKey;
    public boolean hiddenInCategory;
    public boolean incompletePrompt;
    public ElementType inlineType;
    public boolean isArrayType;
    public boolean isEmail;
    public boolean isFieldArray;
    public boolean isGroupedElement;
    public boolean isMutableKey;
    public boolean isOutDatedArray;
    public boolean isPrimaryKey;
    public boolean isSingleSelection;
    public int mMaskingValue;
    public int mMaxLength;
    public int mMinAge;
    public String mProfilePath;
    public String parentPathKey;
    public String pathKey;
    public int position;
    public int selectedIndex;
    public boolean shouldStoreHistory;
    public String userVisiblePath;
    public final transient o0 xmlElement;

    /* renamed from: net.oneformapp.schema.Element$1, reason: invalid class name */
    /* loaded from: classes9.dex */
    public final class AnonymousClass1 implements Parcelable.Creator {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ AnonymousClass1(int i) {
            this.$r8$classId = i;
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int i = 0;
            switch (this.$r8$classId) {
                case 0:
                    Element element = new Element();
                    element.isPrimaryKey = false;
                    element.children = new ArrayList();
                    element.mProfilePath = null;
                    element.isArrayType = false;
                    element.isFieldArray = false;
                    element.isMutableKey = false;
                    element.mMaskingValue = -99;
                    element.mMinAge = 0;
                    element.mMaxLength = -1;
                    element.isGroupedElement = false;
                    element.firstYear = 0;
                    element.isOutDatedArray = false;
                    element.isEmail = false;
                    element.dashboardStat = true;
                    element.shouldStoreHistory = true;
                    element.hiddenInCategory = false;
                    element.incompletePrompt = true;
                    element.isSingleSelection = false;
                    element.selectedIndex = 0;
                    element.isPrimaryKey = parcel.readByte() != 0;
                    element.displayName = parcel.readString();
                    element.elementName = parcel.readString();
                    element.elementTypeName = parcel.readString();
                    element.parentPathKey = parcel.readString();
                    element.formKey = parcel.readString();
                    element.pathKey = parcel.readString();
                    element.position = parcel.readInt();
                    element.userVisiblePath = parcel.readString();
                    element.elementValue = parcel.readString();
                    element.annotation = (Annotation) parcel.readSerializable();
                    element.children = parcel.createTypedArrayList(Element.CREATOR);
                    element.inlineType = (ElementType) parcel.readSerializable();
                    element.mProfilePath = parcel.readString();
                    element.isArrayType = parcel.readByte() != 0;
                    element.isFieldArray = parcel.readByte() != 0;
                    element.isMutableKey = parcel.readByte() != 0;
                    element.mMaskingValue = parcel.readInt();
                    element.mMinAge = parcel.readInt();
                    element.mMaxLength = parcel.readInt();
                    element.isGroupedElement = parcel.readByte() != 0;
                    element.firstYear = parcel.readInt();
                    element.isOutDatedArray = parcel.readByte() != 0;
                    element.isEmail = parcel.readByte() != 0;
                    element.dashboardStat = parcel.readByte() != 0;
                    element.shouldStoreHistory = parcel.readByte() != 0;
                    element.hiddenInCategory = parcel.readByte() != 0;
                    element.incompletePrompt = parcel.readByte() != 0;
                    element.isSingleSelection = parcel.readByte() != 0;
                    element.selectedIndex = parcel.readInt();
                    return element;
                case 1:
                    parcel.getClass();
                    return new GovernmentIdNfcData((Uri) parcel.readParcelable(GovernmentIdNfcData.class.getClassLoader()), (Uri) parcel.readParcelable(GovernmentIdNfcData.class.getClassLoader()), (Uri) parcel.readParcelable(GovernmentIdNfcData.class.getClassLoader()), ChipAuthenticationStatus.valueOf(parcel.readString()));
                case 2:
                    parcel.getClass();
                    return new MdocRequestMetadata$GoogleWalletRequestMetadata(parcel.readString(), MdocRequestMetadata$IdType.valueOf(parcel.readString()), parcel.readString());
                case 3:
                    parcel.getClass();
                    return new Suggestion(parcel.readString(), parcel.readString());
                case 4:
                    parcel.getClass();
                    int readInt = parcel.readInt();
                    ArrayList arrayList = new ArrayList(readInt);
                    while (i != readInt) {
                        i = CameraState$Type$EnumUnboxingLocalUtility.m(CollectedData.class, parcel, arrayList, i, 1);
                    }
                    return new CollectedData(arrayList);
                case 5:
                    parcel.getClass();
                    return new CollectedGovernmentIdDetails((Date) parcel.readSerializable(), (Date) parcel.readSerializable());
                case 6:
                    parcel.getClass();
                    return new DocumentFile((File) parcel.readSerializable());
                case 7:
                    parcel.getClass();
                    return ErrorCode.valueOf(parcel.readString());
                case 8:
                    parcel.getClass();
                    String readString = parcel.readString();
                    GovernmentIdCapture.Side valueOf = GovernmentIdCapture.Side.valueOf(parcel.readString());
                    GovernmentIdCapture.CaptureMethod valueOf2 = GovernmentIdCapture.CaptureMethod.valueOf(parcel.readString());
                    int readInt2 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt2);
                    while (i != readInt2) {
                        i = CameraState$Type$EnumUnboxingLocalUtility.m(GovernmentIdCapture.Frame.CREATOR, parcel, arrayList2, i, 1);
                    }
                    return new GovernmentIdCapture(readString, valueOf, valueOf2, arrayList2);
                case 9:
                    parcel.getClass();
                    return new GovernmentIdCapture.Frame((File) parcel.readSerializable(), parcel.readString());
                case 10:
                    parcel.getClass();
                    return new SelfieCapture(SelfieCapture.CaptureMethod.valueOf(parcel.readString()), (File) parcel.readSerializable());
                case 11:
                    parcel.getClass();
                    String readString2 = parcel.readString();
                    int readInt3 = parcel.readInt();
                    ArrayList arrayList3 = new ArrayList(readInt3);
                    while (i != readInt3) {
                        i = CameraState$Type$EnumUnboxingLocalUtility.m(DocumentFile.CREATOR, parcel, arrayList3, i, 1);
                    }
                    return new StepData.DocumentStepData(readString2, arrayList3);
                case 12:
                    parcel.getClass();
                    String readString3 = parcel.readString();
                    int readInt4 = parcel.readInt();
                    ArrayList arrayList4 = new ArrayList(readInt4);
                    while (i != readInt4) {
                        i = CameraState$Type$EnumUnboxingLocalUtility.m(GovernmentIdCapture.CREATOR, parcel, arrayList4, i, 1);
                    }
                    return new StepData.GovernmentIdStepData(readString3, arrayList4, CollectedGovernmentIdDetails.CREATOR.createFromParcel(parcel));
                case 13:
                    parcel.getClass();
                    return new StepData.SelfieStepData(parcel.readString(), parcel.readInt() == 0 ? null : SelfieCapture.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SelfieCapture.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? SelfieCapture.CREATOR.createFromParcel(parcel) : null);
                case 14:
                    parcel.getClass();
                    String readString4 = parcel.readString();
                    int readInt5 = parcel.readInt();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(readInt5);
                    while (i != readInt5) {
                        linkedHashMap.put(parcel.readString(), parcel.readValue(StepData.UiStepData.class.getClassLoader()));
                        i++;
                    }
                    return new StepData.UiStepData(readString4, linkedHashMap);
                case 15:
                    parcel.getClass();
                    return new ComponentParam.Address(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                case 16:
                    parcel.getClass();
                    return new ComponentParam.ComponentBoolean(parcel.readInt() != 0);
                case 17:
                    parcel.getClass();
                    return new ComponentParam.ComponentNumber((Number) parcel.readSerializable());
                case 18:
                    parcel.getClass();
                    return new ComponentParam.ComponentString(parcel.readString());
                case 19:
                    parcel.getClass();
                    return new ComponentParam.ComponentStringList(parcel.createStringArrayList());
                case 20:
                    parcel.getClass();
                    return new ComponentParam.ESignature(parcel.readString());
                case 21:
                    parcel.getClass();
                    int readInt6 = parcel.readInt();
                    ArrayList arrayList5 = new ArrayList(readInt6);
                    int i2 = 0;
                    while (i2 != readInt6) {
                        i2 = CameraState$Type$EnumUnboxingLocalUtility.m(ComponentParam.FileUpload.class, parcel, arrayList5, i2, 1);
                    }
                    return new ComponentParam.FileUpload(arrayList5, parcel.readInt() != 0);
                case 22:
                    parcel.getClass();
                    return new ComponentParam.GovernmentIdNfcScan(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? ChipAuthenticationStatus.valueOf(parcel.readString()) : null);
                case 23:
                    parcel.getClass();
                    return new ComponentParam.InternationalDbParams(parcel.readString(), parcel.readString(), parcel.readString());
                case 24:
                    parcel.getClass();
                    return new ComponentParam.PhoneNumberSnaParams(parcel.readString(), parcel.readString(), parcel.readString());
                case 25:
                    parcel.getClass();
                    String readString5 = parcel.readString();
                    int readInt7 = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt7);
                    while (i != readInt7) {
                        linkedHashMap2.put(parcel.readString(), parcel.readParcelable(UiStepData.class.getClassLoader()));
                        i++;
                    }
                    return new UiStepData(readString5, linkedHashMap2);
                default:
                    parcel.getClass();
                    return new UiStepFragment.UiStepFragmentArgs(UiWorkflow.Input.CREATOR.createFromParcel(parcel));
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return new Element[i];
                case 1:
                    return new GovernmentIdNfcData[i];
                case 2:
                    return new MdocRequestMetadata$GoogleWalletRequestMetadata[i];
                case 3:
                    return new Suggestion[i];
                case 4:
                    return new CollectedData[i];
                case 5:
                    return new CollectedGovernmentIdDetails[i];
                case 6:
                    return new DocumentFile[i];
                case 7:
                    return new ErrorCode[i];
                case 8:
                    return new GovernmentIdCapture[i];
                case 9:
                    return new GovernmentIdCapture.Frame[i];
                case 10:
                    return new SelfieCapture[i];
                case 11:
                    return new StepData.DocumentStepData[i];
                case 12:
                    return new StepData.GovernmentIdStepData[i];
                case 13:
                    return new StepData.SelfieStepData[i];
                case 14:
                    return new StepData.UiStepData[i];
                case 15:
                    return new ComponentParam.Address[i];
                case 16:
                    return new ComponentParam.ComponentBoolean[i];
                case 17:
                    return new ComponentParam.ComponentNumber[i];
                case 18:
                    return new ComponentParam.ComponentString[i];
                case 19:
                    return new ComponentParam.ComponentStringList[i];
                case 20:
                    return new ComponentParam.ESignature[i];
                case 21:
                    return new ComponentParam.FileUpload[i];
                case 22:
                    return new ComponentParam.GovernmentIdNfcScan[i];
                case 23:
                    return new ComponentParam.InternationalDbParams[i];
                case 24:
                    return new ComponentParam.PhoneNumberSnaParams[i];
                case 25:
                    return new UiStepData[i];
                default:
                    return new UiStepFragment.UiStepFragmentArgs[i];
            }
        }
    }

    public Element(o0 o0Var) {
        String nodeValue;
        String nodeValue2;
        String nodeValue3;
        String nodeValue4;
        String nodeValue5;
        String nodeValue6;
        String nodeValue7;
        String nodeValue8;
        String nodeValue9;
        String nodeValue10;
        m1 m1Var;
        String attribute;
        this.isPrimaryKey = false;
        this.children = new ArrayList();
        this.mProfilePath = null;
        this.isArrayType = false;
        this.isFieldArray = false;
        this.isMutableKey = false;
        this.mMaskingValue = -99;
        this.mMinAge = 0;
        this.mMaxLength = -1;
        this.isGroupedElement = false;
        this.firstYear = 0;
        this.isOutDatedArray = false;
        this.isEmail = false;
        this.dashboardStat = true;
        this.shouldStoreHistory = true;
        this.hiddenInCategory = false;
        this.incompletePrompt = true;
        this.isSingleSelection = false;
        this.selectedIndex = 0;
        this.xmlElement = o0Var;
        this.elementName = o0Var.r;
        Element actingElement = actingElement();
        o0 o0Var2 = actingElement.xmlElement;
        b2 b2Var = o0Var2.u;
        if (b2Var != null) {
            actingElement.actingElement().elementTypeName = b2Var.i;
        }
        Annotation annotation = new Annotation();
        annotation.documentation = "";
        w wVar = o0Var2.e;
        if (wVar != null && (m1Var = wVar.e) != null) {
            Iterator it = ((Vector) m1Var.a).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof z) {
                    f fVar = ((z) next).f;
                    for (int i = 0; i < fVar.getLength(); i++) {
                        Node item = fVar.item(i);
                        if ((item instanceof org.w3c.dom.Element) && (attribute = ((org.w3c.dom.Element) item).getAttribute("default")) != null) {
                            annotation.label = attribute;
                        }
                    }
                }
                if (next instanceof n0) {
                    f fVar2 = ((n0) next).g;
                    for (int i2 = 0; i2 < fVar2.getLength(); i2++) {
                        Node item2 = fVar2.item(i2);
                        String nodeValue11 = item2.getNodeValue();
                        if (nodeValue11 != null && nodeValue11.length() > 0) {
                            annotation.documentation += item2.getNodeValue();
                        }
                    }
                }
            }
        }
        actingElement.annotation = annotation;
        String str = annotation.label;
        if (str == null || str.trim().length() <= 0) {
            actingElement.displayName = o0Var2.r;
        } else {
            actingElement.displayName = actingElement.annotation.label;
        }
        Map map = o0Var.d;
        if (map != null) {
            for (Object obj : map.keySet()) {
                if ((obj instanceof String) && ((String) obj).equals("EXTERNAL_ATTRIBUTES")) {
                    Map map2 = (Map) map.get(obj);
                    if (map2 == null) {
                        return;
                    }
                    for (Object obj2 : map2.keySet()) {
                        if ((obj2 instanceof QName) && (map2.get(obj2) instanceof Node)) {
                            Node node = (Node) map2.get(obj2);
                            if (node != null && node.getLocalName() != null && node.getLocalName().equals("key") && (nodeValue10 = node.getNodeValue()) != null && nodeValue10.equalsIgnoreCase("true")) {
                                actingElement().isPrimaryKey = true;
                            }
                            if (node != null && node.getLocalName() != null && node.getLocalName().equals("mask") && (nodeValue9 = node.getNodeValue()) != null) {
                                actingElement().mMaskingValue = Integer.parseInt(nodeValue9);
                            }
                            if (node != null && node.getLocalName() != null && node.getLocalName().equals("minAge") && (nodeValue8 = node.getNodeValue()) != null) {
                                actingElement().mMinAge = Integer.parseInt(nodeValue8);
                            }
                            if (node != null && node.getLocalName() != null && node.getLocalName().equals("firstYear") && (nodeValue7 = node.getNodeValue()) != null) {
                                actingElement().firstYear = Integer.parseInt(nodeValue7);
                            }
                            if (node != null && node.getLocalName() != null && node.getLocalName().equals("keyboard") && (nodeValue6 = node.getNodeValue()) != null && nodeValue6.equals("email")) {
                                actingElement().isEmail = true;
                            }
                            if (node != null && node.getLocalName() != null && node.getLocalName().equals("dashboardStat") && (nodeValue5 = node.getNodeValue()) != null && nodeValue5.equalsIgnoreCase("false")) {
                                actingElement().dashboardStat = false;
                            }
                            if (node != null && node.getLocalName() != null && node.getLocalName().equals("history") && (nodeValue4 = node.getNodeValue()) != null && nodeValue4.equalsIgnoreCase("false")) {
                                actingElement().shouldStoreHistory = false;
                            }
                            if (node != null && node.getLocalName() != null && node.getLocalName().equals("hiddenInCategories") && (nodeValue3 = node.getNodeValue()) != null && nodeValue3.equalsIgnoreCase("true")) {
                                actingElement().hiddenInCategory = true;
                            }
                            if (node != null && node.getLocalName() != null && node.getLocalName().equals("incompletePrompt") && (nodeValue2 = node.getNodeValue()) != null && nodeValue2.equalsIgnoreCase("false")) {
                                actingElement().incompletePrompt = false;
                            }
                            if (node != null && node.getLocalName() != null && node.getLocalName().equals("maxLength") && (nodeValue = node.getNodeValue()) != null) {
                                actingElement().mMaxLength = Integer.parseInt(nodeValue);
                            }
                        }
                    }
                }
            }
        }
    }

    public static void alterPathForArraysElement(String str, String str2, Element element) {
        List list = element.actingElement().children;
        for (int i = 0; i < list.size(); i++) {
            Element element2 = (Element) list.get(i);
            if (element2 != null && element2.hasChildElements()) {
                String replace = element2.actingElement().pathKey.replace(str, str2);
                String replace2 = element2.actingElement().parentPathKey.replace(str, str2);
                element2.actingElement().pathKey = replace;
                element2.actingElement().parentPathKey = replace2;
                alterPathForArraysElement(str, str2, element2);
            } else if (element2 != null && element2.actingElement().pathKey != null) {
                String replace3 = element2.actingElement().pathKey.replace(str, str2);
                element2.actingElement().parentPathKey = element2.actingElement().parentPathKey.replace(str, str2);
                element2.actingElement().pathKey = replace3;
            }
        }
    }

    public static String appendIndex(String str, int i, boolean z) {
        String str2 = str + "[" + i + "]";
        return z ? str2.concat(".") : str2;
    }

    public static Element findLeafElement(String str, Element element) {
        String formattedPathKey = element.getFormattedPathKey();
        if (!formattedPathKey.equals(str)) {
            if (!formattedPathKey.equals(str + ".")) {
                Iterator it = element.actingElement().children.iterator();
                while (it.hasNext()) {
                    Element findLeafElement = findLeafElement(str, (Element) it.next());
                    if (findLeafElement != null) {
                        return findLeafElement;
                    }
                }
                return null;
            }
        }
        return element;
    }

    public static Element findLeafElementWithSuffix(String str, Element element) {
        String formattedPathKey = element.getFormattedPathKey();
        if (!formattedPathKey.endsWith(str)) {
            if (!formattedPathKey.endsWith(str + ".")) {
                Iterator it = element.actingElement().children.iterator();
                while (it.hasNext()) {
                    Element findLeafElementWithSuffix = findLeafElementWithSuffix(str, (Element) it.next());
                    if (findLeafElementWithSuffix != null) {
                        return findLeafElementWithSuffix;
                    }
                }
                return null;
            }
        }
        return element;
    }

    public static Element findPrimaryKeyPath(Element element) {
        Element element2 = null;
        for (Element element3 : element.actingElement().children) {
            if (element3.actingElement().isPrimaryKey) {
                return element3;
            }
            element2 = findPrimaryKeyPath(element3);
            if (element2 != null && element2.actingElement().isPrimaryKey) {
                break;
            }
        }
        return element2;
    }

    public final Element actingElement() {
        List list;
        int i = this.selectedIndex;
        return (!this.isSingleSelection || (list = this.children) == null || i < 0 || i >= list.size()) ? this : (Element) this.children.get(i);
    }

    public final void alterPathForArrays(int i) {
        String str = actingElement().pathKey;
        String appendIndex = appendIndex(getFormattedPathKey(), i, str.endsWith("."));
        this.pathKey = appendIndex(getFormattedPathKey(), i, hasChildElements());
        alterPathForArraysElement(str, appendIndex, actingElement());
    }

    public final Object clone() {
        return new Element(this);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void filloutPathKey(String str, String str2, HashMap hashMap, LinkedHashMap linkedHashMap) {
        Element actingElement = actingElement();
        if (str == null) {
            actingElement.pathKey = actingElement.actingElement().elementName;
        } else {
            actingElement.parentPathKey = str;
            StringBuilder m108m = Recorder$$ExternalSyntheticOutline2.m108m(str, ".");
            m108m.append(actingElement.actingElement().elementName);
            actingElement.pathKey = m108m.toString();
        }
        if (str2 == null) {
            actingElement.userVisiblePath = actingElement.getDisplayName();
        } else {
            StringBuilder m108m2 = Recorder$$ExternalSyntheticOutline2.m108m(str2, " > ");
            m108m2.append(actingElement.getDisplayName());
            actingElement.userVisiblePath = m108m2.toString();
        }
        hashMap.put(actingElement.pathKey, Integer.valueOf(hashMap.size() + 1));
        linkedHashMap.put(actingElement.pathKey, this);
        Iterator it = actingElement.children.iterator();
        while (it.hasNext()) {
            ((Element) it.next()).filloutPathKey(actingElement.pathKey, actingElement.userVisiblePath, hashMap, linkedHashMap);
        }
    }

    public final String getAppendablePathKey() {
        Element actingElement = actingElement();
        boolean endsWith = actingElement.pathKey.endsWith(".");
        String str = actingElement.pathKey;
        return endsWith ? str : Recorder$$ExternalSyntheticOutline2.m$1(str, ".");
    }

    public final Element getChildElementAt(int i) {
        if (i >= getChildrenCount() + 1) {
            return null;
        }
        return (Element) actingElement().children.get(i);
    }

    public final int getChildrenCount() {
        return actingElement().children.size();
    }

    public final String getDisplayName() {
        Element actingElement = actingElement();
        String str = actingElement.displayName;
        String str2 = actingElement.pathKey;
        if (str2 != null) {
            Toolbar.AnonymousClass1.extractIndex(str2);
        }
        return str;
    }

    public final Element getFirstChildElement() {
        Element actingElement = actingElement();
        List list = actingElement.children;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return (Element) actingElement.children.get(0);
    }

    public final String getFormattedParentPathKey() {
        return Toolbar.AnonymousClass1.getFormattedPathKey(actingElement().parentPathKey);
    }

    public final String getFormattedPathKey() {
        return Toolbar.AnonymousClass1.getFormattedPathKey(actingElement().pathKey);
    }

    public final boolean hasChildElements() {
        return actingElement().children.size() > 0;
    }

    public final boolean isAddress() {
        String str = actingElement().pathKey;
        return str != null && str.startsWith("AddressDetails");
    }

    public final boolean isCreditcard() {
        String str = actingElement().pathKey;
        return str != null && str.startsWith("CreditCards");
    }

    public final boolean isCreditcardNumber() {
        String str = actingElement().pathKey;
        return str != null && str.startsWith("CreditCards.CreditCard") && str.endsWith(".Number");
    }

    public final boolean isDateType() {
        String str = actingElement().actingElement().elementTypeName;
        return str != null && str.equals("DateType");
    }

    public final boolean isMonthYearType() {
        String str = actingElement().actingElement().elementTypeName;
        return str != null && str.equals("MonthYearType");
    }

    public final boolean isNonRecursiveType() {
        return ElementType.isNonRecursiveType(actingElement().actingElement().elementTypeName);
    }

    @Override // com.fillr.core.model.ModelBase
    public final boolean onValidate() {
        return true;
    }

    public final void setChildElements(Collection collection) {
        String str;
        String str2;
        String str3;
        Element actingElement = actingElement();
        actingElement.children.clear();
        actingElement.children.addAll(collection);
        if (actingElement.isNonRecursiveType()) {
            if (actingElement.actingElement().elementTypeName.equals("Image")) {
                actingElement.setElementValue("Image stored");
                return;
            }
            if (actingElement.actingElement().elementTypeName.equals("MonthYearType") || actingElement.actingElement().elementTypeName.equals("DateType")) {
                String str4 = null;
                if (actingElement.actingElement().elementTypeName.equals("DateType")) {
                    for (Element element : actingElement.children) {
                        if (element.actingElement().elementName.contains("Day")) {
                            str = element.actingElement().elementValue;
                            break;
                        }
                    }
                }
                str = null;
                Iterator it = actingElement.children.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str2 = null;
                        break;
                    }
                    Element element2 = (Element) it.next();
                    if (element2.actingElement().elementName.contains("Month")) {
                        str2 = element2.actingElement().elementValue;
                        break;
                    }
                }
                Iterator it2 = actingElement.children.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        str3 = null;
                        break;
                    }
                    Element element3 = (Element) it2.next();
                    if (element3.actingElement().elementName.contains("Year")) {
                        str3 = element3.actingElement().elementValue;
                        break;
                    }
                }
                if (str != null && !str.equals("")) {
                    str4 = str;
                }
                if (str2 == null || str2.equals("")) {
                    str2 = str4;
                } else if (str4 != null) {
                    str2 = Recorder$$ExternalSyntheticOutline2.m(str4, "-", str2);
                }
                if (str3 == null || str3.equals("")) {
                    str3 = str2;
                } else if (str2 != null) {
                    str3 = Recorder$$ExternalSyntheticOutline2.m(str2, "-", str3);
                }
                setElementValue(str3);
            }
        }
    }

    public final void setElementValue(String str) {
        actingElement().elementValue = str;
    }

    public final String toString(String str) {
        StringBuilder m = Boxes$$ExternalSyntheticOutline1.m(str);
        m.append(this.displayName);
        m.append("\n");
        Iterator it = this.children.iterator();
        while (it.hasNext()) {
            m.append(((Element) it.next()).toString(str.concat(str)));
        }
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.isPrimaryKey ? (byte) 1 : (byte) 0);
        parcel.writeString(this.displayName);
        parcel.writeString(this.elementName);
        parcel.writeString(this.elementTypeName);
        parcel.writeString(this.parentPathKey);
        parcel.writeString(this.formKey);
        parcel.writeString(this.pathKey);
        parcel.writeInt(this.position);
        parcel.writeString(this.userVisiblePath);
        parcel.writeString(this.elementValue);
        parcel.writeSerializable(this.annotation);
        parcel.writeTypedList(this.children);
        parcel.writeSerializable(this.inlineType);
        parcel.writeString(this.mProfilePath);
        parcel.writeByte(this.isArrayType ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isFieldArray ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isMutableKey ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.mMaskingValue);
        parcel.writeInt(this.mMinAge);
        parcel.writeInt(this.mMaxLength);
        parcel.writeByte(this.isGroupedElement ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.firstYear);
        parcel.writeByte(this.isOutDatedArray ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isEmail ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.dashboardStat ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.shouldStoreHistory ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.hiddenInCategory ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.incompletePrompt ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isSingleSelection ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.selectedIndex);
    }

    public final String toString() {
        return this.displayName + " of type " + this.elementTypeName;
    }

    public Element(Element element) {
        this.isPrimaryKey = false;
        this.children = new ArrayList();
        this.mProfilePath = null;
        this.isArrayType = false;
        this.isFieldArray = false;
        this.isMutableKey = false;
        this.mMaskingValue = -99;
        this.mMinAge = 0;
        this.mMaxLength = -1;
        this.isGroupedElement = false;
        this.firstYear = 0;
        this.isOutDatedArray = false;
        this.isEmail = false;
        this.dashboardStat = true;
        this.shouldStoreHistory = true;
        this.hiddenInCategory = false;
        this.incompletePrompt = true;
        this.isSingleSelection = false;
        this.selectedIndex = 0;
        this.displayName = element.displayName;
        this.elementName = element.elementName;
        this.inlineType = element.inlineType;
        this.elementTypeName = element.elementTypeName;
        this.parentPathKey = element.parentPathKey;
        this.pathKey = element.pathKey;
        this.position = element.position;
        this.userVisiblePath = element.userVisiblePath;
        this.elementValue = element.elementValue;
        this.annotation = element.annotation;
        this.isArrayType = element.isArrayType;
        this.isPrimaryKey = element.isPrimaryKey;
        this.isFieldArray = element.isFieldArray;
        this.isMutableKey = element.isMutableKey;
        this.mProfilePath = element.mProfilePath;
        this.mMaskingValue = element.mMaskingValue;
        this.mMinAge = element.mMinAge;
        this.children = new ArrayList();
        this.isGroupedElement = element.isGroupedElement;
        this.firstYear = element.firstYear;
        this.formKey = element.formKey;
        this.isEmail = element.isEmail;
        this.dashboardStat = element.dashboardStat;
        this.shouldStoreHistory = element.shouldStoreHistory;
        Iterator it = element.children.iterator();
        while (it.hasNext()) {
            this.children.add(new Element((Element) it.next()));
        }
        this.isOutDatedArray = element.isOutDatedArray;
        this.hiddenInCategory = element.actingElement().hiddenInCategory;
        this.incompletePrompt = element.incompletePrompt;
        this.mMaxLength = element.mMaxLength;
        this.isSingleSelection = element.isSingleSelection;
        this.selectedIndex = element.selectedIndex;
    }
}
